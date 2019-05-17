package sort.bucket;

import javafx.collections.transformation.SortedList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by ZhangYulong on 2019/4/6
 */
public class BucketSort {
    public static int[] bucketSort(int[] a, int n, int bucketNum) {
        if (n <= 1) return a;

        int max = a[0];
        for (int i = 1; i < n; ++i) {
            if (max < a[i]) {
                max = a[i];
            }
        }

        assert bucketNum > 0;

        ArrayList[] c = new ArrayList[bucketNum];
        for (int i = 0; i < bucketNum; ++i) {
            c[i] = new ArrayList();
        }
        int mod = max / bucketNum + 1;

        for (int j : a) {
            int x = j / mod;
            c[x].add(j);
        }

        int k = 0;
        for (ArrayList s : c) {
            s.sort(new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    return (int) o1 - (int) o2;
                }
            });
            for (Object x : s) {
                a[k++] = (int) x;
            }
        }
        return a;
    }
}
