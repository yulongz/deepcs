package sort.bubble;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static sort.bubble.BubbleSort.*;

/**
 * Created by ZhangYulong on 2019/4/4
 */
public class TestBubbleSort {

    int[] a = {};
    int[] b = {};

    @Before
    public void init() {
        a = new int[]{4, 2, 1, 6, 5};
        b = new int[]{1, 2, 3, 4, 5};
    }

    @Test
    public void testBubbleSort() {
        Assert.assertArrayEquals(new int[]{1, 2, 4, 5, 6}, bubbleSort(a, a.length));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, bubbleSort(b, b.length));
    }

    @Test
    public void testBubbleSort2() {
        Assert.assertArrayEquals(new int[]{1, 2, 4, 5, 6}, bubbleSort2(a, a.length));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, bubbleSort2(b, b.length));

    }
}
