package search;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static search.SkipList.MAX_LEVEL;

/**
 * Created by ZhangYulong on 2019/4/7
 */
public class TestSkipList {

    @Test
    public void testRandomLevel(){
        SkipList skipList = new SkipList();
        int[] count = new int[MAX_LEVEL];
        for (int i=0;i<10000;++i) {
            int x = skipList.randomLevel();
            count[x]++;
        }
        System.out.println(Arrays.toString(count));
    }

    @Test
    public void testSkipList(){
        SkipList skipList = new SkipList();
        Random random = new Random();

        for(int i=0;i<100;++i){
            skipList.insert(random.nextInt(10000));
        }

        skipList.printAll();
    }
}
