package tree;

import org.junit.Test;

public class ArrayTreeNodeTest {

    static ArrayTreeNode root;

    public static class ArrayTreeNode {
        Object element;
        ArrayTreeNode[] childs;
        int childSize;

        public ArrayTreeNode(Object element) {
            this.element = element;
            this.childs = new ArrayTreeNode[10];
            this.childSize = 0;
        }
    }

    public ArrayTreeNodeTest() {
        root = new ArrayTreeNode(null);
    }

    public void addChild(ArrayTreeNode treeNode) {
        root.childs[root.childSize] = treeNode;
        root.childSize++;
    }

    @Test
    public void arrayTreeNodeTest() {
        ArrayTreeNodeTest tree = new ArrayTreeNodeTest();
        tree.addChild(new ArrayTreeNode(1));
        tree.addChild(new ArrayTreeNode(10));
        for (int i = 0; i < root.childSize; i++) {
            System.out.println(i);
            System.out.println(root.childs[i].element);
        }
    }

}

