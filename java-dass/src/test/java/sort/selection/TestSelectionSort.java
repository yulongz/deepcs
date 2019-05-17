package sort.selection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static sort.selection.SelectionSort.selectionSort;

/**
 * Created by ZhangYulong on 2019/4/4
 */
public class TestSelectionSort {


    int[] a = {};
    int[] b = {};

    @Before
    public void init() {
        a = new int[]{4, 2, 1, 6, 5};
        b = new int[]{1, 2, 3, 4, 5};
    }

    @Test
    public void testSelectionSort() {
        Assert.assertArrayEquals(new int[]{1, 2, 4, 5, 6}, selectionSort(a, a.length));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, selectionSort(b, b.length));
    }
}
