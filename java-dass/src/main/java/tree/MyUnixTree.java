package tree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyUnixTree {

    public static final Log LOG = LogFactory.getLog(MyUnixTree.class.getName());

    MyTreeNode root;
    int treeDeep;
    int nodeCount;

    public MyUnixTree(){
        root = new MyTreeNode("/",0);
        treeDeep = 0;
        nodeCount = 1;
    }

    class MyTreeNode {
        Object element;
        MyTreeNode firstChild;
        MyTreeNode nextSibling;
        int deep;

        public MyTreeNode(Object element,int deep) {
            this.element = element;
            this.firstChild = null;
            this.nextSibling = null;
            this.deep = deep;
        }
    }

    public void add(String fileName){
        String[] splits = split(fileName);
        MyTreeNode current = root;
        for (int i=1;i<splits.length;i++){
            if (current.firstChild == null){
                current.firstChild = new MyTreeNode(splits[i],i);
                current = current.firstChild;
                nodeCount++;
            }else{
                current = current.firstChild;
                while(! current.element.equals(splits[i]) && current.nextSibling != null){
                    current = current.nextSibling;
                }
                if(current.element.equals(splits[i])){
                    //
                } else if(current.nextSibling == null){
                    current.nextSibling = new MyTreeNode(splits[i],i);
                    current = current.nextSibling;
                    nodeCount++;
                }
            }
        }
        if(treeDeep < splits.length-1 ){
            treeDeep = splits.length-1;
        }
    }

    public String[] split(String fileName){
        if(! fileName.startsWith("/")){
            LOG.error("路径不对");
            throw new IllegalArgumentException();
        }
        return fileName.split("/");
    }

    public void listAll(){
        if(root.firstChild == null){
            LOG.info("空树");
        }else{
            listAll(root);
        }
    }

    private void listAll(MyTreeNode treeNode) {
        if(treeNode != null){
            StringBuilder blank = new StringBuilder();
            for(int i=0;i<treeNode.deep;i++){
                blank.append("  ");
            }
            LOG.info(blank.append(treeNode.element));
            listAll(treeNode.firstChild);
            listAll(treeNode.nextSibling);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
