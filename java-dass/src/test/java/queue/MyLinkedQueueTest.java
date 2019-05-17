package queue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyLinkedQueueTest {

    MyLinkedQueue<Integer> queue = new MyLinkedQueue<>();

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
