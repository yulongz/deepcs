package search;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static search.BinarySearch.bsearch;
import static search.BinarySearch.bsearch1;

/**
 * Created by ZhangYulong on 2019/4/6
 */
public class TestBinarySearch {

    int[] a = {};

    @Before
    public void init() {
        a = new int[]{1, 2, 3, 4, 5};
    }

    @Test
    public void testBSearch() {
        Assert.assertEquals(3, bsearch1(a, a.length,4));
        Assert.assertEquals(-1, bsearch1(a, a.length,6));

        Assert.assertEquals(3, bsearch(a, a.length,4));
        Assert.assertEquals(-1, bsearch(a, a.length,6));

    }

}
