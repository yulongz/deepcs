package sort.merge;

/**
 * Created by ZhangYulong on 2019/4/4
 */
public class MergeSort {

    public static int[] merge_sort(int[] a, int n) {
        merge_sort_c(a, 0, n - 1);
        return a;
    }

    private static void merge_sort_c(int[] a, int p, int r) {
        if (p >= r) {
            return;
        }
        int q = (p + r) / 2;
        merge_sort_c(a, p, q);
        merge_sort_c(a, q + 1, r);
        merge(a, p, q, r);
    }

    private static void merge(int[] a, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int k = 0;
        int[] tmp = new int[r - p + 1];
        while (i <= q && j <= r) {
            if (a[i] <= a[j]) {
                tmp[k++] = a[i++];
            } else {
                tmp[k++] = a[j++];
            }
        }

        int start = i;
        int end = q;
        if (j <= r) {
            start = j;
            end = r;
        }
        while (start <= end) {
            tmp[k++] = a[start++];
        }

        for (i = 0; i <= r - p; ++i) {
            a[p + i] = tmp[i];
        }
    }
}
