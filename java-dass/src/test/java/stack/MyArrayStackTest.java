package stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayStackTest {

    MyArrayStack<Integer> stack = new MyArrayStack<>();

    @Before
    public void before() {
    }

    @Test
    public void searchTest() {
        stack.clear();
        for (int i = 1; i <= 4; i++) {
            stack.push(i);
        }
        assertEquals(4, stack.size());
        assertEquals(2, stack.search(3));
    }

    @After
    public void After() {
    }
}
