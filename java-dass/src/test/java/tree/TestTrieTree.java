package tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ZhangYulong on 2019/4/8
 */
public class TestTrieTree {

    private TrieTree trieTree;

    @Before
    public void init() {
        trieTree = new TrieTree();
    }

    @Test
    public void testTrie() {
        String[] strings = new String[]{
                "how", "hi", "her", "hello", "so", "see"
        };
        for (String string : strings) {
            trieTree.insert(string.toCharArray());
        }
        Assert.assertEquals(true, trieTree.find("her".toCharArray()));
        Assert.assertEquals(true, trieTree.find("so".toCharArray()));
    }
}
