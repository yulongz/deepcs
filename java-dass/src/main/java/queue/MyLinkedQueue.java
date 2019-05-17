package queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * @author zhangyulong
 */
public class MyLinkedQueue<T>  {

    private LinkedList<T> list = new LinkedList<>();

    private static final int INITIALCAPACITY = 5;
    private int capacity;

    MyLinkedQueue(int capacity){
        this.capacity = capacity;
    }

    MyLinkedQueue(){
        this(INITIALCAPACITY);
    }

    boolean add(T e){
        capacity=capacity*2;
        return list.add(e);
    }

    boolean offer(T e){
        if(this.capacity <= list.size()){
            throw new IllegalStateException();
        }
        capacity++;
        return list.add(e);
    }

    T remove(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        T obj = list.get(0);
        capacity--;
        list.remove(0);
        return obj;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    T poll(){
        if(isEmpty()){
            return null;
        }
        T obj = list.get(0);
        capacity--;
        list.remove(0);
        return obj;
    }

    T element(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return list.get(0);
    }

    T peek(){
        if(isEmpty()){
            return null;
        }
        return list.get(0);
    }

    public int size(){
        return list.size();
    }

    public void clear(){
        list.clear();
        capacity = INITIALCAPACITY;
    }


}
