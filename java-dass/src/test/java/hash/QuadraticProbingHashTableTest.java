package hash;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import util.CharacterUtils;

/**
 * Created by ZhangYulong on 2018/5/10
 */
public class QuadraticProbingHashTableTest {

    @Before
    public void init() {
    }

    @Test
    public void insertTest() {
        QuadraticProbingHashTable quadraticProbingHashTable = new QuadraticProbingHashTable(11);

        quadraticProbingHashTable.makeEmpty();

        int TestInitSum = 100000;
        int TestSum = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < TestInitSum; i++) {
            String randomString = CharacterUtils.getRandomString(5);
            if (!quadraticProbingHashTable.contains(randomString)) {
                quadraticProbingHashTable.insert(randomString);
                TestSum++;
            }
        }
        long end = System.currentTimeMillis();
        int listLength = quadraticProbingHashTable.getArrayLength();
        int hashTableSize = quadraticProbingHashTable.getCurrentSize();
        double loadFactor = quadraticProbingHashTable.getLoadFactor();
        System.out.println("    insert " + TestInitSum + " cost time:" + (end - start) + "ms");
        System.out.println("    hashtable list length:" + listLength);
        System.out.println("    hashtable size:" + hashTableSize);
        System.out.println("    load factor:" + String.format("%.3f", loadFactor));

        Assert.assertEquals(hashTableSize, TestSum);
    }
}
