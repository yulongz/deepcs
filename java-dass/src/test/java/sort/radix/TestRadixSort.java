package sort.radix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static sort.radix.RadixSort.radixSort;

/**
 * Created by ZhangYulong on 2019/4/6
 */
public class TestRadixSort {

    int[] a = {};
    int[] b = {};

    @Before
    public void init() {
        a = new int[]{3, 435, 21, 43, 232};
        b = new int[]{1, 22, 555, 444, 333};
    }

    @Test
    public void testSelectionSort() {
        Assert.assertArrayEquals(new int[]{3, 21, 43, 232, 435}, radixSort(a));
        Assert.assertArrayEquals(new int[]{1, 22, 333, 444, 555}, radixSort(b));
    }
}
