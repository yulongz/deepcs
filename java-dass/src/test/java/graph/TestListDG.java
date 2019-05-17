package graph;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by ZhangYulong on 2019/4/8
 */
public class TestListDG {

    private ListDG listDG;

    @Before
    public void init (){

//        char[] charNodes = new char[]{1,2,3,4,5,6,7};
//        char[][] charEdges = new char[][]{
//                {1,2},{1,3},{1,4},
//                {2,4},{2,5},
//                {3,6},
//                {4,3},{4,6},{4,7},
//                {5,4},{5,7},
//                {7,6}
//        };
        char[] charNodes = new char[]{'a','b','c','d','e','f','g'};
        char[][] charEdges = new char[][]{
                {'a','b'},{'a','c'},{'a','d'},
                {'b','d'},{'b','e'},
                {'c','f'},
                {'d','c'},{'d','f'},{'d','g'},
                {'e','d'},{'e','g'},
                {'g','f'}
        };

        listDG = new ListDG(charNodes,charEdges);
    }

    @Test
    public void testPrint(){
        listDG.print();
    }

    @Test
    public void testTopologicalSort(){
        listDG.topologicalSort();
    }

    @Test
    public void testBFS(){
        listDG.BFS();
    }

    @Test
    public void testDFS(){
        listDG.DFS();
    }

}
