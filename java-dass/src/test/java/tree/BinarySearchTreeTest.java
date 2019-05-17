package tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class BinarySearchTreeTest {
    BinarySearchTree binarySearchTree = new BinarySearchTree();

    @Before
    public void before() {
    }

    @Test
    public void insertTest() {
        binarySearchTree.makeEmpty();
        for (int i = 1; i <= 10; i++) {
            binarySearchTree.insert(i);
        }
        binarySearchTree.printTree();
        System.out.println(binarySearchTree.findMax());
    }

    @Test
    public void removeTest() {
        binarySearchTree.makeEmpty();
        for (int i = 1; i <= 10; i++) {
            binarySearchTree.insert(i);
        }
        binarySearchTree.remove(4);
        binarySearchTree.printTree();
    }

    @Test
    public void balanceTest() {
        binarySearchTree.makeEmpty();
        for (int i = 1; i <= 10000000; i++) {
            binarySearchTree.insert((int) (Math.random() * 10000000));
        }
        long start = System.nanoTime();
        System.out.println(binarySearchTree.findMax());
        System.out.println(System.nanoTime() - start + "ns");
    }

    @Test
    public void unBalanceTest() {
        binarySearchTree.makeEmpty();
        // 顺序插入元素太多时，递归调用报java.lang.StackOverflowError堆栈溢出错误
        // 非平衡BST，存在这些问题
        for (int i = 1; i <= 2000; i++) {
            binarySearchTree.insert(i);
        }
        long start = System.nanoTime();
        System.out.println(binarySearchTree.findMax());
        System.out.println(System.nanoTime() - start + "ns");
    }
}
