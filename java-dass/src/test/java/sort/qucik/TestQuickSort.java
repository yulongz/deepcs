package sort.qucik;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static sort.quick.QuickSort.quickSort;

/**
 * Created by ZhangYulong on 2019/4/4
 */
public class TestQuickSort {

    int[] a = {};
    int[] b = {};

    @Before
    public void init() {
        a = new int[]{4, 2, 1, 6, 5};
        b = new int[]{1, 2, 3, 4, 5};
    }

    @Test
    public void testInsertionSort() {
        Assert.assertArrayEquals(new int[]{1, 2, 4, 5, 6}, quickSort(a, a.length));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, quickSort(b, b.length));
    }

}
