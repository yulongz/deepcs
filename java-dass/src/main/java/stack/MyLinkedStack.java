package stack;

import java.util.EmptyStackException;

/**
 * @author zhangyulong
 */
public class MyLinkedStack<T> {

    private int elementCount;
    private Node<T> top;

    private static class Node<T>{
        private T data;
        private MyLinkedStack.Node<T> prev;
        public Node(T d, MyLinkedStack.Node<T> p)
        {
            data=d;
            prev=p;
        }
    }

    public MyLinkedStack(){
        top = new Node(null,null);
        elementCount = 0;
    }

    public T push(T item) {
        top = new Node(item,top);
        elementCount++;
        return item;
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
        return top.data;
    }


    public boolean empty() {
        return size() == 0;
    }

    public synchronized int search(Object o) {
         Node<T> current = top;
        if (o == null) {
            for(int i=1;i<=elementCount;i++){
                if (current.data==null) {
                    return i;
                }
                current = current.prev;
            }

        } else {
            for (int i=1;i<=elementCount;i++) {
                if (o.equals(current.data)) {
                    return i;
                }
                current = current.prev;
            }
        }
        return -1;
    }


    public synchronized int size() {
        return elementCount;
    }

    public synchronized void clear(){
        elementCount = 0;
        top = new Node(null,null);
    }
}
