package stack;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyStackTest {

    MyStack<Integer> stack = new MyStack<>();

    @Before
    public void before() {
    }

    @Test
    public void searchTest() {
        stack.clear();
        for (int i = 1; i <= 4; i++) {
            stack.push(i);
        }
        Assert.assertEquals(4, stack.size());
        Assert.assertEquals(2, stack.search(3));
    }

    @After
    public void After() {
    }
}
