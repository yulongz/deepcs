package stack;

import java.util.EmptyStackException;

/**
 * @author zhangyulong
 */
public class MyArrayStack<T> {

    private T[] elementData;
    private int initialCapacity = 10;
    private int elementCount;

    public MyArrayStack(){
        elementData = (T[]) new Object[initialCapacity];
        elementCount = 0;
    }

    public T push(T item) {
        addElement(item);
        return item;
    }

    private void addElement(T item) {
        if(elementCount >= elementData.length){
            elementgrow(elementCount * 2);
        }
        elementData[elementCount++] = item;
    }

    private void elementgrow(int newCapacity) {
        T[] old = elementData;
        elementData = (T[]) new Object[newCapacity];
        for(int i=0;i<size();i++){
            elementData[i] = old[i];
        }
    }

    public synchronized T pop() {
        T obj;
        int len = size();
        if (len == 0){
            throw new EmptyStackException();
        }
        obj = peek();
        removeElement();
        return obj;
    }

    private void removeElement() {
        elementCount--;
    }

    public synchronized T peek() {
        int  len = size();
        if (len == 0){
            throw new EmptyStackException();
        }
        return elementAt(len - 1);
    }

    private T elementAt(int i) {
        if(i >= size()){
            throw new IndexOutOfBoundsException();
        }
        return elementData[i];
    }

    public boolean empty() {
        return size() == 0;
    }

    public synchronized int search(Object o) {
        int i = lastIndexOf(o);

        if (i >= 0) {
            return size() - i;
        }
        return -1;
    }

    private int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = elementCount-1; i >= 0; i--) {
                if (elementData[i]==null) {
                    return i;
                }
            }
        } else {
            for (int i = elementCount-1; i >= 0; i--) {
                if (o.equals(elementData[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public synchronized int size() {
        return elementCount;
    }

    public synchronized void clear(){
        elementCount=0;
        elementData = (T[]) new Object[initialCapacity];
    }
}
