package sort.bubble;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by ZhangYulong on 2019/4/4
 */
public class BubbleSort {

    public static final Log LOG = LogFactory.getLog(BubbleSort.class.getName());

    private BubbleSort() {
    }

    public static int[] bubbleSort(int[] a, int n) {
        int outerLoopCount = 0;
        int innerLoopCount = 0;
        if (n <= 1) {
            LOG.info("outerLoopCount:" + outerLoopCount);
            LOG.info("innerLoopCount:" + innerLoopCount);
            return a;
        }
        for (int i = 0; i < n; ++i) {
            ++outerLoopCount;
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                ++innerLoopCount;
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        LOG.info("outerLoopCount:" + outerLoopCount);
        LOG.info("innerLoopCount:" + innerLoopCount);
        return a;
    }

    public static int[] bubbleSort2(int[] a, int n) {
        int outerLoopCount = 0;
        int innerLoopCount = 0;
        if (n <= 1) {
            LOG.info("outerLoopCount:" + outerLoopCount);
            LOG.info("innerLoopCount:" + innerLoopCount);
            return a;
        }
        for (int i = 0, flag = 0; i < n && flag == 0; ++i) {
            ++outerLoopCount;
            flag = 1;
            for (int j = 0; j < n - i - 1; ++j) {
                ++innerLoopCount;
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = 0;
                }
            }
        }
        LOG.info("outerLoopCount:" + outerLoopCount);
        LOG.info("innerLoopCount:" + innerLoopCount);
        return a;
    }
}
