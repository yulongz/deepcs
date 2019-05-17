package sort.shell;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import sort.insertion.InsertionSort;

/**
 * Created by ZhangYulong on 2019/4/4
 */
public class ShellSort {
    public static final Log LOG = LogFactory.getLog(ShellSort.class.getName());


    public static int[] shellSort(int[] a) {
        int innerLoopCount = 0;
        int outerLoopCount = 0;
        if (a.length <= 1) {
            LOG.info("outerLoopCount:" + outerLoopCount);
            LOG.info("innerLoopCount:" + innerLoopCount);
            return a;
        }
        int j;
        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            ++outerLoopCount;
            for (int i = gap; i < a.length; i++) {
                int tmp = a[i];
                for (j = i; j >= gap && tmp < a[j - gap]; j -= gap) {
                    a[j] = a[j - gap];
                    ++innerLoopCount;
                }
                a[j] = tmp;
            }
        }
        LOG.info("outerLoopCount:" + outerLoopCount);
        LOG.info("innerLoopCount:" + innerLoopCount);
        return a;
    }
}
