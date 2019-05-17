package tree;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MyUnixTreeTest {


    @Test
    public void splitTest() {
        String name = "/user/bin";
        String[] splits = name.split("/");
        Arrays.stream(splits).forEach(s -> System.out.println(s));
    }

    @Test
    public void addTest() {
        MyUnixTree myUnixTree = new MyUnixTree();
        myUnixTree.add("/abc/123");
        myUnixTree.add("/abc/234");
        myUnixTree.add("/ABC/123");
        myUnixTree.add("/ABC/234");
        Assert.assertEquals(7, myUnixTree.nodeCount);
        Assert.assertEquals(2, myUnixTree.treeDeep);
    }

    @Test
    public void listAllTest() {
        MyUnixTree myUnixTree = new MyUnixTree();
        myUnixTree.add("/abc/123");
        myUnixTree.add("/abc/234");
        myUnixTree.add("/ABC/123");
        myUnixTree.add("/ABC/234");
        myUnixTree.listAll();
    }
}
