package sort.insertion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by ZhangYulong on 2019/4/4
 */
public class InsertionSort {

    public static final Log LOG = LogFactory.getLog(InsertionSort.class.getName());

    private InsertionSort() {
    }

    public static int[] insertionSort(int[] a, int n) {
        int innerLoopCount = 0;
        int outerLoopCount = 0;
        if (n <= 1) {
            LOG.info("outerLoopCount:" + outerLoopCount);
            LOG.info("innerLoopCount:" + innerLoopCount);
            return a;
        }

        for (int i = 1; i < n; ++i) {
            ++outerLoopCount;
            int value = a[i];
            int j = i - 1;
            for(;j>=0;--j){
                ++innerLoopCount;
                if(a[j]>value){
                    a[j+1] = a[j];
                }else{
                    break;
                }
            }
            a[j+1] = value;
        }
        LOG.info("outerLoopCount:" + outerLoopCount);
        LOG.info("innerLoopCount:" + innerLoopCount);
        return a;

    }


}
