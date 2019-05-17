package heap;

import org.junit.Before;
import org.junit.Test;
import util.CharacterUtils;

/**
 * Created by ZhangYulong on 2018/5/11
 */
public class BinaryHeapTest {

    BinaryHeap binaryHeap;

    @Before
    public void init() {
        binaryHeap = new BinaryHeap();
    }

    @Test
    public void insertTest() {
        binaryHeap.makeEmpty();
        int TestInitSum = 10;
        long start = System.currentTimeMillis();
        for (int i = 0; i < TestInitSum; i++) {
            String randomString = CharacterUtils.getRandomString(1);
            binaryHeap.insert(randomString);
        }
        long end = System.currentTimeMillis();
        System.out.println("    CostTime:" + (end - start) + "ms");
        System.out.println("    Array Capacity:" + binaryHeap.getCapacity());
        System.out.println("    CurrentSize:" + binaryHeap.getCurrentSize());
        System.out.println("    Min:" + binaryHeap.findMin());
        binaryHeap.printAll();
    }

    @Test
    public void topK() {
        binaryHeap.makeEmpty();
        int TestInitSum = 100;
        int k = 10;

        for (int i = 0; i < TestInitSum; i++) {
            String randomString = CharacterUtils.getRandomString(1);
            if (binaryHeap.getCurrentSize() <= k) {
                binaryHeap.insert(randomString);
            } else {
                if (binaryHeap.findMin().compareTo(randomString) < 0) {
                    binaryHeap.deleteMin();
                    binaryHeap.insert(randomString);
                }
            }
        }
        binaryHeap.printAll();
    }
}
