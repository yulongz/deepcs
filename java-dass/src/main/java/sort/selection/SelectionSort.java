package sort.selection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;

/**
 * Created by ZhangYulong on 2019/4/4
 */
public class SelectionSort {

    public static final Log LOG = LogFactory.getLog(SelectionSort.class.getName());

    private SelectionSort() {
    }

    public static int[] selectionSort(int[] a, int n) {
        int outerLoopCount = 0;
        int innerLoopCount = 0;
        if (n <= 1) {
            LOG.info("outerLoopCount:" + outerLoopCount);
            LOG.info("innerLoopCount:" + innerLoopCount);
            return a;
        }

        for (int i = 0; i < n; ++i) {
            ++outerLoopCount;
            int min = i;
            for (int j = i + 1; j < n; ++j) {
                ++innerLoopCount;
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            int tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
            System.out.println(Arrays.toString(a));
        }
        LOG.info("outerLoopCount:" + outerLoopCount);
        LOG.info("innerLoopCount:" + innerLoopCount);
        return a;
    }
}
