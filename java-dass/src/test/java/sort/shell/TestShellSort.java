package sort.shell;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static sort.shell.ShellSort.shellSort;

/**
 * Created by ZhangYulong on 2019/4/4
 */
public class TestShellSort {

    int[] a = {};
    int[] b = {};

    @Before
    public void init() {
        a = new int[]{4, 2, 1, 6, 5};
        b = new int[]{1, 2, 3, 4, 5};
    }

    @Test
    public void testShellSort() {
        Assert.assertArrayEquals(new int[]{1, 2, 4, 5, 6}, shellSort(a));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, shellSort(b));
    }
}
