package queue;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayQueue<T> {

    private T[] elementData;
    private int initialCapacity = 5;
    private int currentCapactiy;
    private int head;
    private int tail;
    private int size;

    public MyArrayQueue() {
        elementData = (T[]) new Object[initialCapacity];
        head = 0;
        tail = 0;
        size = 0;
        currentCapactiy = initialCapacity;
    }


    //添加元素，自动扩展队列长度
    boolean add(T e) {
        if (e == null) {
            throw new NullPointerException();
        }

        if (size == currentCapactiy) {
            currentCapactiy = currentCapactiy * 2;
            T[] a = (T[]) new Object[currentCapactiy];
            int r = size - head;
            System.arraycopy(elementData, head, a, 0, r);
            System.arraycopy(elementData, 0, a, r, head);
            elementData = a;
            head = 0;
            tail = size;
        }
        elementData[tail] = e;
        tail = (++tail) % currentCapactiy;
        size++;
        return true;
    }

    //添加元素，不扩展队列长度
    boolean offer(T e) {
        if (e == null) {
            throw new NullPointerException();
        }
        if (size == currentCapactiy) {
            throw new IllegalStateException();
        }
        elementData[tail] = e;
        tail = (++tail) % currentCapactiy;
        size++;
        return true;
    }

    T remove() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return removeHead();
    }

    private T removeHead() {
        T obj = elementData[head];
        head = (++head) % currentCapactiy;
        size--;
        return obj;
    }

    T poll() {
        if (size == 0) {
            return null;
        }
        return removeHead();
    }

    T element() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return elementData[head];
    }

    T peek() {
        if (size == 0) {
            return null;
        }
        return elementData[head];
    }

    public int size() {
        return size;
    }

    public java.util.Iterator<T> iterator() {
        return new MyArrayQueueIterator();
    }


    private class MyArrayQueueIterator implements Iterator<T> {

        private int current = head;
        private int iteratorSize = 0;

        @Override
        public boolean hasNext() {
            if (size == 0) {
                return false;
            } else {
                return iteratorSize < size;
            }
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T obj = elementData[current];
            current = (++current) % currentCapactiy;
            iteratorSize++;
            return obj;
        }
    }

    public boolean empty() {
        return size() == 0;
    }

    public void clear() {
        elementData = (T[]) new Object[initialCapacity];
        head = 0;
        tail = 0;
        size = 0;
        currentCapactiy = initialCapacity;
    }

}
