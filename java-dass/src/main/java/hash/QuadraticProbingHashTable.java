package hash;

/**
 * Created by ZhangYulong on 2018/5/10
 *
 * @author hadoop
 */
public class QuadraticProbingHashTable<T> {

    private static final int DEFAULT_TABLE_SIZE = 11;
    private HashEntry<T>[] array;
    private int currentSize;

    public QuadraticProbingHashTable() {
        this(DEFAULT_TABLE_SIZE);
    }

    public QuadraticProbingHashTable(int size) {
        allocateArray(size);
        makeEmpty();
    }

    public void makeEmpty() {
        currentSize = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    public boolean contains(T x) {
        // 找到相等的或者空的，要不相等->true，要不空值或false->false
        int currentPos = findPos(x);
        return isActive(currentPos);
    }

    public void insert(T x) {
        // 经过上面的findPos，找到的当前节点为空，或者当前节点element相等的位置。
        int currentPos = findPos(x);

        // 这里判断active，其实判断的是为不为空，那么肯定就是和element相等了,所以不做操作直接返回。
        if (isActive(currentPos)) {
            return;
        }

        // 到这一步肯定既为空，同时element不相等了，所以赋值并且设置currentPos为active。
        array[currentPos] = new HashEntry<>(x, true);

        // 当元素个数达到array长度一半时，需要rehash
        if (++currentSize > array.length / 2) {
            rehash();
        }
    }

    public void remove(T x) {
        // 找到相等的或者空的，要不相等->true，要不空值或false->false
        int currentPos = findPos(x);
        if (isActive(currentPos)) {
            array[currentPos].isActive = false;
        }
    }

    private static class HashEntry<T> {
        public T element;
        public boolean isActive;

        public HashEntry(T e) {
            this(e, true);
        }

        public HashEntry(T e, boolean i) {
            this.element = e;
            this.isActive = i;
        }
    }

    private void allocateArray(int arraySize) {
        array = new HashEntry[arraySize];
    }

    private boolean isActive(int currentPos) {
        // 非空，并且active
        return array[currentPos] != null && array[currentPos].isActive;
    }

    private int findPos(T x) {
        // 三种情况：包含element+active、包含element+not active、不包含element

        int offset = 1;
        int currentPos = myhash(x);

        //当前节点不为空，并且当前节点不等于x
        while (array[currentPos] != null && !array[currentPos].element.equals(x)) {
            currentPos += offset ^ 2;
            offset += 1;
            // 如果currentPos超过array的长度，则减去长度，继续查找
            if (currentPos >= array.length) {
                currentPos -= array.length;
            }
        }
        return currentPos;
    }

    private void rehash() {
        HashEntry<T>[] oldArray = array;
        // rehash就是长度翻倍后，继续增大找到最接近的素数
        allocateArray(nextPrime(2 * oldArray.length));
        currentSize = 0;
        for (int i = 0; i < oldArray.length; i++) {
            if (oldArray[i] != null && oldArray[i].isActive) {
                insert(oldArray[i].element);
            }
        }
    }

    private int myhash(T x) {
        int hashVal = x.hashCode();

        hashVal %= array.length;
        if (hashVal < 0) {
            hashVal += array.length;
        }
        return hashVal;
    }

    private static int nextPrime(int n) {
        if (n % 2 == 0) {
            n++;
        }

        for (; !isPrime(n); n += 2) {
            ;
        }

        return n;
    }

    private static boolean isPrime(int n) {
        if (n == 2 || n == 3)
            return true;

        if (n == 1 || n % 2 == 0)
            return false;

        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;

        return true;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public int getArrayLength() {
        return array.length;
    }

    public double getLoadFactor() {
        return (double) getCurrentSize() / (double) getArrayLength();
    }
}
