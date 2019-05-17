package hash;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ZhangYulong on 2018/5/9
 * @author hadoop
 */
public class SeparateChainingHashTable<T> {

    public static final int DEFAULT_TABLE_SIZE = 101;
    public static final boolean DEFAULT_ISREHASH = true;
    private List<T>[] theLists;
    private int currentSize;
    private boolean isReHash;

    public SeparateChainingHashTable() {
        this(DEFAULT_TABLE_SIZE, DEFAULT_ISREHASH);
    }

    public SeparateChainingHashTable(int size) {
        this(size, DEFAULT_ISREHASH);
    }

    public SeparateChainingHashTable(boolean isReHash) {
        this(DEFAULT_TABLE_SIZE, isReHash);
    }

    public SeparateChainingHashTable(int size, boolean isReHash) {
        theLists = new LinkedList[nextPrime(size)];
        for (int i = 0; i < theLists.length; i++) {
            theLists[i] = new LinkedList<>();
        }
        currentSize = 0;
        this.isReHash = isReHash;
    }

    public void insert(T x) {
        List<T> whichList = theLists[myhash(x)];
        if (!whichList.contains(x)) {
            //List.add接口实现的是从List结尾添加元素。
            // 如果新插入数据更有可能被访问，可以使用LinkedList.addFirst插入到List头位置
            whichList.add(x);
            currentSize++;
            if (isReHash && currentSize > theLists.length) {
                rehash();
            }
        }
    }

    public void remove(T x) {
        List<T> whichList = theLists[myhash(x)];
        if (whichList.contains(x)) {
            whichList.remove(x);
            currentSize--;
        }
    }

    public boolean contains(T x) {
        List<T> whichList = theLists[myhash(x)];
        return whichList.contains(x);
    }

    public void makeEmpty() {
        for (int i = 0; i < theLists.length; i++) {
            theLists[i].clear();
        }
        currentSize = 0;
    }

    private void rehash() {
        List<T>[] oldLists = theLists;
        theLists = new List[nextPrime(2 * theLists.length)];
        for (int j = 0; j < theLists.length; j++) {
            theLists[j] = new LinkedList<>();
        }
        currentSize = 0;
        for (int i = 0; i < oldLists.length; i++) {
            for (T item : oldLists[i]) {
                insert(item);
            }
        }
    }

    private int myhash(T x) {
        int hashVal = x.hashCode();

        hashVal %= theLists.length;
        if (hashVal < 0) {
            hashVal += theLists.length;
        }
        return hashVal;
    }

    /**
     * 选择一个更靠谱的tableSize
     */
    private static int nextPrime(int n) {
        // 避免偶数
        if (n % 2 == 0) {
            n++;
        }
        for (; !isPrime(n); n += 2) {
            ;
        }

        return n;
    }

    private static boolean isPrime(int n) {

        if (n == 2 || n == 3) {
            return true;
        }

        // 去掉1和偶数
        if (n == 1 || n % 2 == 0) {
            return false;
        }

        // 过滤能被奇数平方整除的数字
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }


    public int getCurrentSize() {
        return currentSize;
    }

    public List<T>[] getTheLists() {
        return theLists;
    }

    public double getLoadFactor() {
        return (double) getCurrentSize() / (double) getTheLists().length;
    }
}
