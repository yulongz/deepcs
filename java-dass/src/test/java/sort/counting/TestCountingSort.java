package sort.counting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static sort.count.CountingSort.countingSort;

/**
 * Created by ZhangYulong on 2019/4/6
 */
public class TestCountingSort {


    int[] a = {};
    int[] b = {};

    @Before
    public void init() {
        a = new int[]{4, 2, 1, 6, 5};
        b = new int[]{1, 2, 3, 4, 5};
    }

    @Test
    public void testCountingSort() {
        Assert.assertArrayEquals(new int[]{1, 2, 4, 5, 6}, countingSort(a, a.length));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, countingSort(b, b.length));
    }

}
