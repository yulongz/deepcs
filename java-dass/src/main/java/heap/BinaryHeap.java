package heap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by ZhangYulong on 2018/5/11
 */
public class BinaryHeap<T extends Comparable<? super T>> {
    public static final Log LOG = LogFactory.getLog(BinaryHeap.class.getName());

    private static final int DEFAULT_CAPACITY=10;
    private int currentSize;
    private T[] array;

    public BinaryHeap(){
        this( DEFAULT_CAPACITY );
    }

    public BinaryHeap(int capacity){
        currentSize = 0;
        array = (T[]) new Comparable[capacity];

    }

    public BinaryHeap(T[] items){
        currentSize = items.length;
        array = items;
    }

    public void insert(T x){
        if(currentSize == array.length-1)
            enlargeArray(array.length*2+1);

        //   A B C D H J
        // 0 1 2 3 4 5 6 7 8 9
        // 找到数组空位置为7
        int hole = ++currentSize;
        // 把插入元素放置在最后元素后的空穴位置，跟父节点进行比对，若小于则互换
        for(;hole>1 && x.compareTo(array[hole/2])<0;hole/=2)
            array[hole] = array[hole/2];

        array[hole] = x;
    }

    public T findMin(){
        if( isEmpty( ) )
            return null;
        return array[ 1 ];
    }

    public T deleteMin(){
        if(isEmpty())
            try {
                throw new UnderflowException("下界溢出");
            } catch (UnderflowException e) {
                LOG.info("下界溢出",e);
            }

        T minItem = findMin();
        array[1] = array[currentSize--];
        percolateDown(1);
        return minItem;
    }

    public boolean isEmpty(){
        return currentSize == 0;
    }

    public void makeEmpty(){
        currentSize = 0;
    }


    private void percolateDown(int hole){
        int child;
        T tmp = array[hole];
        // 把数组最后一个元素放置在根位置，然后跟两个子节点中较小的值进行比对，若小于则互换
        for(;hole * 2 <= currentSize;hole = child){
            child = hole*2;
            // 左边
            if(child != currentSize && array[child+1].compareTo(array[child])<0)
                child++;

            if(array[child].compareTo(tmp)<0)
                array[hole] = array[child];
            else
                break;
        }
        array[hole] = tmp;
    }

    public void buildHeap(){
        for( int i = currentSize / 2; i > 0; i-- )
            percolateDown( i );
    }

    private void enlargeArray(int newSize){
        T[] newArray = (T[]) new Comparable[newSize];
        for(int i=0;i<array.length;i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int getCurrentSize(){
        return currentSize;
    }

    public int getCapacity(){
        return array.length;
    }

    public void printAll(){
        for(int i=1;i<=currentSize;i++){
            System.out.println(array[i]);
        }
    }

}
class UnderflowException extends Exception {
    public UnderflowException(String string) { }
}
