package queue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayQueueTest {

    MyArrayQueue<Integer> queue = new MyArrayQueue();

    @Before
    public void before() {
    }

    @Test
    public void addTest() {
        queue.clear();
        for (int i = 1; i <= 6; i++) {
            queue.add(i);
        }
        assertEquals(6, queue.size());
    }

    @Test
    public void offerTest() {
        queue.clear();
        for (int i = 1; i <= 5; i++) {
            queue.offer(i);
        }
        assertEquals(5, queue.size());
    }

    @Test
    public void removeTest() {
        queue.clear();
        for (int i = 1; i <= 5; i++) {
            queue.add(i);
        }
        queue.remove();
        assertEquals(4, queue.size());
    }

    @After
    public void after() {
    }

}
