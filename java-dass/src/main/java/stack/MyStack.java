package stack;

import java.util.EmptyStackException;
import java.util.Vector;

/**
 * @author zhangyulong
 */
public class MyStack<T> extends Vector<T> {

    public static final long serialVersionUID = 1L;

    public MyStack() {
        //TODO
    }

    public T push(T item) {
        addElement(item);
        return item;
    }

    public synchronized T pop() {
        T obj;
        int len = size();
        obj = peek();
        removeElement(len - 1);
        return obj;
    }

    public synchronized T peek() {
        int  len = size();
        if (len == 0){
            throw new EmptyStackException();
        }
        return elementAt(len - 1);
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

}
