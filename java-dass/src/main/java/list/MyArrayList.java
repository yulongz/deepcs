package list;

/**
 * @author zhangyulong
 */
public class MyArrayList<T> implements Iterable<T>{
    private static final int DEFAULT_CAPACITY = 10;

    private int theSize;
    private T[] theItems;

    public MyArrayList(){
        clear();
    }

    private void clear() {
        theSize=0;
        ensureCapacity(DEFAULT_CAPACITY);
    }

    public int size(){
        return theSize;
    }

    public boolean beEmpty(){
        return size() == 0;
    }

    public void trimToSize(){
        ensureCapacity(size());
    }

    public T get(int idx) {
        if(idx < 0|| idx>=size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        return theItems[idx];
    }

    public T set(int idx,T newVal){
        if(idx < 0 || idx>= size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        T old = theItems[idx];
        theItems[idx] = newVal;
        return old;
    }

    private void ensureCapacity(int newCapacity) {
        if(newCapacity < theSize){
            return;
        }
        T[] old = theItems;
        theItems = (T[]) new Object[newCapacity];
        for(int i=0;i<size();i++){
            theItems[i] = old[i];
        }
    }

    public boolean add(T x){
        add(size(),x);
        return true;
    }

    public boolean add(int idx,T x){
        if(theItems.length == size()){
            ensureCapacity(size() * 2 + 1);
        }
        for(int i = theSize;i>idx;i--){
            theItems[i] = theItems[i-1];
        }
        theItems[idx] = x;
        theSize++;
        return true;
    }

    public T remove(int idx){
        T removedItem = theItems[idx];
        for(int i = idx;i<size()-1;i++){
            theItems[i]=theItems[i+1];
        }
        theSize--;
        return removedItem;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements java.util.Iterator<T> {

        private int current = 0;

        @Override
        public boolean hasNext() {
            return current<size();
        }

        @Override
        public T next() {
            if(!hasNext()){
                throw new java.util.NoSuchElementException();
            }
            return theItems[current++];
        }

        @Override
        public void remove(){
            MyArrayList.this.remove(--current);
        }
    }
}
