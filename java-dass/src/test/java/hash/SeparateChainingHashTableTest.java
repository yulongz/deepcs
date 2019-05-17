package hash;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import util.CharacterUtils;

import java.util.List;

/**
 * Created by ZhangYulong on 2018/5/10
 */
public class SeparateChainingHashTableTest {

    SeparateChainingHashTable separateChainingHashTable;

    @Before
    public void init() {
    }

    @Test
    public void reHashTest() {
        separateChainingHashTable = new SeparateChainingHashTable(101, true);
        System.out.println("rehash");
        insertTest(separateChainingHashTable);
    }

    @Test
    public void notReHashTest() {
        separateChainingHashTable = new SeparateChainingHashTable(101, false);
        System.out.println("not rehash");
        insertTest(separateChainingHashTable);
    }

    public static void insertTest(SeparateChainingHashTable separateChainingHashTable) {
        separateChainingHashTable.makeEmpty();

        int TestInitSum = 100000;
        int TestSum = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < TestInitSum; i++) {
            String randomString = CharacterUtils.getRandomString(5);
            if (!separateChainingHashTable.contains(randomString)) {
                separateChainingHashTable.insert(randomString);
                TestSum++;
            }
        }
        long end = System.currentTimeMillis();
        int listLength = separateChainingHashTable.getTheLists().length;
        int hashTableSize = separateChainingHashTable.getCurrentSize();
        double loadFactor = separateChainingHashTable.getLoadFactor();
        System.out.println("    insert " + TestInitSum + " cost time:" + (end - start) + "ms");
        System.out.println("    hashtable list length:" + listLength);
        System.out.println("    hashtable size:" + hashTableSize);
        System.out.println("    load factor:" + String.format("%.3f", loadFactor));
        Assert.assertEquals(hashTableSize, TestSum);

        List[] theLists = separateChainingHashTable.getTheLists();
        int tableSize = 0;
        for (List list : theLists) {
            tableSize += list.size();
        }
        Assert.assertEquals(tableSize, TestSum);
    }
}
