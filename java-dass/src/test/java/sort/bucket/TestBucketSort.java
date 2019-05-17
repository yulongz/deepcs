package sort.bucket;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static sort.bucket.BucketSort.bucketSort;
import static sort.insertion.InsertionSort.insertionSort;

/**
 * Created by ZhangYulong on 2019/4/6
 */
public class TestBucketSort {

    int[] a = {};
    int[] b = {};

    @Before
    public void init() {
        a = new int[]{4, 2, 1, 6, 5};
        b = new int[]{1, 2, 3, 4, 5};
    }

    @Test
    public void testBucketSort() {
        Assert.assertArrayEquals(new int[]{1, 2, 4, 5, 6}, bucketSort(a, a.length,3));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, bucketSort(b, b.length,3));
    }
}
