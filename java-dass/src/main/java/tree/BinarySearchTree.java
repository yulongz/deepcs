package tree;

import java.util.Comparator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BinarySearchTree<T extends Comparable<? super T>> {

    public static final Log LOG = LogFactory.getLog(BinarySearchTree.class.getName());

    private static class BinaryNode<T> {
        /*Figure 4.16*/
        T element;
        BinaryNode<T> left;
        BinaryNode<T> right;

        //Constructors
        BinaryNode(T theElement) {
            this(theElement, null, null);
        }

        BinaryNode(T theElement, BinaryNode<T> lt, BinaryNode<T> rt) {
            element = theElement;
            left = lt;
            right = rt;
        }
    }

    private int compareTo(T l, T r) {
        if (cmp != null) {
            return cmp.compare(l, r);
        } else {
            return l.compareTo(r);
        }
    }

    private BinaryNode<T> root;
    private Comparator<? super T> cmp;

    public BinarySearchTree() {
        this(null);
    }

    public BinarySearchTree(Comparator<? super T> c) {
        root = null;
        cmp = c;
    }

    public void makeEmpty() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean contains(T x) {
        return contains(x, root);
    }

    private boolean contains(T x, BinaryNode<T> t) {
        /*Figure 4.18*/
        if (isEmpty()) {
            return false;
        }

        int compareResult = compareTo(x, t.element);

        if (compareResult < 0) {
            return contains(x, t.left);
        } else if (compareResult > 0) {
            return contains(x, t.right);
        } else {
            return true;
        }
    }

    public T findMin() {
        if (isEmpty()) {
            try {
                throw new UnderflowException("下界溢出");
            } catch (UnderflowException e) {
                LOG.info("下界溢出", e);
            }
        }
        return findMin(root).element;
    }

    private BinaryNode<T> findMin(BinaryNode<T> t) {
        /*Figure 4.20*/
        /*递归实现*/
        if (t == null) {
            throw new NullPointerException("Empty Node");
        } else if (t.left == null) {
            return t;
        }
        return findMin(t.left);
    }

    public T findMax() {
        if (isEmpty()) {
            try {
                throw new UnderflowException("下界溢出");
            } catch (UnderflowException e) {
                LOG.info("下界溢出", e);
            }
        }
        return findMax(root).element;
    }

    private BinaryNode<T> findMax(BinaryNode<T> t) {
        /*Figure 4.20*/
        /*非递归实现*/
        if (t == null) {
            throw new NullPointerException("Empty Node");
        } else {
            while (t.right != null) {
                t = t.right;
            }
        }
        return t;
    }

    public void insert(T x) {
        root = insert(x, root);
    }

    private BinaryNode<T> insert(T x, BinaryNode<T> t) {
        /*Figure 4.22*/
        if (t == null) {
            return new BinaryNode(x, null, null);
        }

        int compareResult = x.compareTo(t.element);

        if (compareResult < 0) {
            t.left = insert(x, t.left);
        } else if (compareResult > 0) {
            t.right = insert(x, t.right);
        }

        return t;
    }

    public void remove(T x) {
        root = remove(x, root);
    }

    private BinaryNode<T> remove(T x, BinaryNode<T> t) {
        /*Figure 4.25*/
        if (t == null) {
            return t;
        }

        int compareResult = x.compareTo(t.element);

        if (compareResult < 0) {
            t.left = remove(x, t.left);
        } else if (compareResult > 0) {
            t.right = remove(x, t.right);
        } else if (t.left != null && t.right != null) {
            t.element = findMin(t.right).element;
            t.right = remove(t.element, t.right);
        } else {
            t = (t.left != null) ? t.left : t.right;
        }
        return t;
    }

    public void printTree() {
        if (isEmpty()) {
            LOG.info("Empty tree");
        } else {
            printTree(root);
        }
    }

    private void printTree(BinaryNode<T> t) {
        if (t != null) {
            printTree(t.left);
            LOG.info(t.element);
            printTree(t.right);
        }
    }

}

class UnderflowException extends Exception {
    public UnderflowException(String string) {

    }
}
