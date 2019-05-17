package Miscellaneous;

import java.util.*;
import java.io.*;
import DataStructures.*;
import DataStructures.LinkedList;

class Vertex2
{
    String     name;   // Vertex2 name
    LinkedList adj;    // Adjacent vertices
    int        dist;   // Cost
    Vertex2 path;   // Previous vertex on shortest path

    public Vertex2(String nm )
      { name = nm; adj = new LinkedList( ); reset( ); }

    public void reset( )
      { dist = Graph2.INFINITY; path = null; }
}

class MapEntry implements Hashable
{
    String vertexName;
    Vertex2 storedVertex;

    public MapEntry( String name )
      { vertexName = new String( name ); storedVertex = null; }
    public int hash( int tableSize )
      { return QuadraticProbingHashTable.hash( vertexName, tableSize ); }
    public boolean equals( Object rhs )
      { return rhs instanceof MapEntry &&
          vertexName.equals( ((MapEntry)rhs).vertexName ); }
}

// Of course, this file should be Graph2.java, but there's already
// version 1. So this will give an error if compiled at the same time
// as Graph2.java.
class Graph2
{
    public static final int INFINITY = Integer.MAX_VALUE;
    private QuadraticProbingHashTable vertexMap =
        new QuadraticProbingHashTable( );    // Maps vertices to internal Vertex2
    private LinkedList allVertices = new LinkedList( );  // List of vertices
    int numVertices = 0;

    public void addEdge( String sourceName, String destName )
    {
        Vertex2 v = getVertex( sourceName );
        Vertex2 w = getVertex( destName );
        v.adj.insert( w, v.adj.zeroth( ) );
    }

    public void printPath( String destName ) throws NoSuchElementException
    {
        MapEntry match = (MapEntry) vertexMap.find( new MapEntry( destName ) );

        if( match == null )
            throw new NoSuchElementException( "Destination vertex not found" );

        Vertex2 w = match.storedVertex;
        if( w.dist == INFINITY )
            System.out.println( destName + " is unreachable" );
        else
        {
            printPath( w );
            System.out.println( );
        }
    }

      // If vertexName is not present, add it to vertexMap.
      // In either case, return the Vertex2.
      // entry is made global to avoid repeated calls to new.
    MapEntry entry = new MapEntry( "" );

    private Vertex2 getVertex(String vertexName )
    {
        entry.vertexName = vertexName;
        MapEntry match = (MapEntry) vertexMap.find( entry );

        if( match == null )
        {
            match = new MapEntry( vertexName );
            match.storedVertex = new Vertex2( vertexName );
            allVertices.insert( match.storedVertex, allVertices.zeroth( ) );
            numVertices++;
            vertexMap.insert( match );
        }
        return match.storedVertex;
    }

    private void printPath( Vertex2 dest )
    {
        if( dest.path != null )
        {
            printPath( dest.path );
            System.out.print( " to " );
        }
        System.out.print( dest.name );
    }

    private void clearAll( )
    {
        for( LinkedListItr itr = allVertices.first( ); !itr.isPastEnd( ); itr.advance( ) )
            ( (Vertex2)itr.retrieve( ) ).reset( );
    }

    public void unweighted( String startName ) throws NoSuchElementException
    {
        clearAll( ); 

        MapEntry match = (MapEntry) vertexMap.find( new MapEntry( startName ) );
        if( match == null )
            throw new NoSuchElementException( "Start vertex not found" );

        try
        {
            Vertex2 start = match.storedVertex;
            QueueAr q = new QueueAr( numVertices );
            q.enqueue( start ); start.dist = 0;

            while( !q.isEmpty( ) )
            {
                Vertex2 v = (Vertex2) q.dequeue( );

                for( LinkedListItr itr = v.adj.first( ); !itr.isPastEnd( ); itr.advance( ) )
                {
                    Vertex2 w = (Vertex2) itr.retrieve( );
                    if( w.dist == INFINITY )
                    {
                        w.dist = v.dist + 1;    
                        w.path = v;
                        q.enqueue( w );
                    }
                }
            }
        }
        catch( Overflow e )
          { System.out.println( "Queue Capacity exceeded unexpectedly!" ); }
    }

    /**
     * Process a request; return false if end of file.
     */
    public static boolean processRequest( BufferedReader in, Graph2 g )
    {
        String startName = null;
        String destName = null;

        try
        {
            System.out.println( "Enter start node:" );
            if( ( startName = in.readLine( ) ) == null )
                return false;
            System.out.println( "Enter destination node:" );
            if( ( destName = in.readLine( ) ) == null )
                return false;

            g.unweighted( startName );
            g.printPath( destName );
        }
        catch( Exception e )
          { System.err.println( e ); }
        return true;
    }

    /**
     * A main routine that:
     * 1. Reads a file containing edges (supplied as a command-line parameter);
     * 2. Forms the graph;
     * 3. Repeatedly prompts for two vertices and
     *    runs the shortest path algorithm.
     * The data file is a sequence of lines of the format
     *    source destination.
     */
    public static void main( String [ ] args )
    {
        Graph2 g = new Graph2( );
        try
        {
            FileReader fin = new FileReader( args[0] );
            BufferedReader graphFile = new BufferedReader( fin );

            // Read the edges and insert
            String line;
            while( ( line = graphFile.readLine( ) ) != null )
            {
                StringTokenizer st = new StringTokenizer( line );

                try
                {
                    if( st.countTokens( ) != 2 )
                        throw new Exception( );
                    String source  = st.nextToken( );
                    String dest    = st.nextToken( );
                    g.addEdge( source, dest );
                }
                catch( Exception e )
                  { System.err.println( e + " " + line ); }
             }
         }
         catch( Exception e )
           { System.err.println( e ); }

         System.out.println( "File read" );

         BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
         while( processRequest( in, g ) )
             ;
    }
}
