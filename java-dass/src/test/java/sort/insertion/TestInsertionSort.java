package sort.insertion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static sort.insertion.InsertionSort.insertionSort;

/**
 * Created by ZhangYulong on 2019/4/4
 */
public class TestInsertionSort {


    int[] a = {};
    int[] b = {};

    @Before
    public void init() {
        a = new int[]{4, 2, 1, 6, 5};
        b = new int[]{1, 2, 3, 4, 5};
    }

    @Test
    public void testInsertionSort() {
        Assert.assertArrayEquals(new int[]{1, 2, 4, 5, 6}, insertionSort(a, a.length));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, insertionSort(b, b.length));
    }

}
