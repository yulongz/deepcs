package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by ZhangYulong on 2019/4/8
 */
public class ListDG {

    //邻接表中表对应的链表
    private class ENode {
        //边指向点的位置
        int ivex;
        //执行下一个边的指针，用以组成边组成的链表
        ENode nextEdge;
    }

    //邻接表中表的顶点
    private class VNode {
        //顶点信息
        char data;
        //指向第一条依附该顶点的边
        ENode firstEdge;
    }

    //顶点数组
    private List<VNode> mVexs;

    /*
     * 创建图(用已提供的矩阵)
     *
     * 参数说明：
     *     vexs  -- 顶点数组
     *     edges -- 边数组
     */
    public ListDG(char[] vexs, char[][] edges) {

        // 初始化"顶点数"和"边数"
        int vlen = vexs.length;
        int elen = edges.length;

        // 初始化"顶点"
        mVexs = new ArrayList<>();
        for (int i = 0; i < vlen; i++) {
            // 新建VNode
            VNode vnode = new VNode();
            vnode.data = vexs[i];
            vnode.firstEdge = null;
            // 将vnode添加到数组mVexs中
            mVexs.add(vnode);
        }

        // 初始化"边"
        for (int i = 0; i < elen; i++) {
            // 读取边的起始顶点和结束顶点
//            char c1 = edges[i][0];
//            char c2 = edges[i][1];
            // 读取边的起始顶点和结束顶点
            int p1 = getPosition(edges[i][0]);
            int p2 = getPosition(edges[i][1]);

            // 初始化node1
            ENode node1 = new ENode();
            node1.ivex = p2;
            // 将node1链接到"p1所在链表的末尾"
            if (mVexs.get(p1).firstEdge == null) {
                mVexs.get(p1).firstEdge = node1;
            } else {
                linkLast(mVexs.get(p1).firstEdge, node1);
            }
        }
    }

    /*
     * 将node节点链接到list的最后
     */
    private void linkLast(ENode list, ENode node) {
        ENode p = list;

        while (p.nextEdge != null) {
            p = p.nextEdge;
        }
        p.nextEdge = node;
    }

    /*
     * 返回ch位置
     */
    private int getPosition(char ch) {
        for (int i = 0; i < mVexs.size(); i++) {
            if (mVexs.get(i).data == ch) {
                return i;
            }
        }
        return -1;
    }

    /*
     * 深度优先搜索遍历图的递归实现
     */
    private void DFS(int i, boolean[] visited) {
        ENode node;

        visited[i] = true;
        System.out.printf("%c ", mVexs.get(i).data);
        node = mVexs.get(i).firstEdge;
        while (node != null) {
            if (!visited[node.ivex])
                DFS(node.ivex, visited);
            node = node.nextEdge;
        }
    }

    /*
     * 深度优先搜索遍历图
     */
    public void DFS() {
        boolean[] visited = new boolean[mVexs.size()];       // 顶点访问标记

        // 初始化所有顶点都没有被访问
        for (int i = 0; i < mVexs.size(); i++) {
            visited[i] = false;
        }

        System.out.print("== DFS: ");
        for (int i = 0; i < mVexs.size(); i++) {
            if (!visited[i]) {
                DFS(i, visited);
            }
        }
        System.out.print("\n");
    }

    /*
     * 广度优先搜索（类似于树的层次遍历）
     */
    public void BFS() {
        int head = 0;
        int rear = 0;
        int[] queue = new int[mVexs.size()];            // 辅组队列
        boolean[] visited = new boolean[mVexs.size()];  // 顶点访问标记

        for (int i = 0; i < mVexs.size(); i++)
            visited[i] = false;

        System.out.print("== BFS: ");
        for (int i = 0; i < mVexs.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                System.out.printf("%c ", mVexs.get(i).data);
                queue[rear++] = i;  // 入队列
            }

            while (head != rear) {
                int j = queue[head++];  // 出队列
                ENode node = mVexs.get(j).firstEdge;
                while (node != null) {
                    int k = node.ivex;
                    if (!visited[k]) {
                        visited[k] = true;
                        System.out.printf("%c ", mVexs.get(k).data);
                        queue[rear++] = k;
                    }
                    node = node.nextEdge;
                }
            }
        }
        System.out.print("\n");
    }

    /*
     * 打印矩阵队列图
     */
    public void print() {
        System.out.print("== List Graph:\n");
        for (int i = 0; i < mVexs.size(); i++) {
            System.out.printf("%d(%c): ", i, mVexs.get(i).data);
            ENode node = mVexs.get(i).firstEdge;
            while (node != null) {
                System.out.printf("%d(%c) ", node.ivex, mVexs.get(node.ivex).data);
                node = node.nextEdge;
            }
            System.out.print("\n");
        }
    }

    /*
     * 拓扑排序
     *
     * 返回值：
     *     -1 -- 失败(由于内存不足等原因导致)
     *      0 -- 成功排序，并输入结果
     *      1 -- 失败(该有向图是有环的)
     */
    public int topologicalSort() {
        int index = 0;
        int num = mVexs.size();
        int[] ins;               // 入度数组
        char[] tops;             // 拓扑排序结果数组，记录每个节点的排序后的序号。
        Queue<Integer> queue;    // 辅组队列

        ins = new int[num];
        tops = new char[num];
        queue = new LinkedList<>();

        // 统计每个顶点的入度数
        for (int i = 0; i < num; i++) {
            ENode node = mVexs.get(i).firstEdge;//先取第一条边的终点
            while (node != null) {
                ins[node.ivex]++;//每条边的终点入度+1
                node = node.nextEdge;//切换到下一条边的终点
            }
        }

        // 将所有入度为0的顶点入队列
        for (int i = 0; i < num; i++) {
            if (ins[i] == 0) {
                queue.offer(i);                 // 入队列
            }
        }

        while (!queue.isEmpty()) {              // 队列非空
            int j = queue.poll().intValue();    // 出队列。j是顶点的序号
            tops[index++] = mVexs.get(j).data;  // 将该顶点添加到tops中，tops是排序结果
            ENode node = mVexs.get(j).firstEdge;// 获取以该顶点为起点的出边队列

            // 将与"node"关联的节点的入度减1；
            // 若减1之后，该节点的入度为0；则将该节点添加到队列中。
            while (node != null) {
                // 将节点(序号为node.ivex)的入度减1。
                ins[node.ivex]--;
                // 若节点的入度为0，则将其"入队列"
                if (ins[node.ivex] == 0)
                    queue.offer(node.ivex);    // 入队列

                node = node.nextEdge;
            }
        }

        if (index != num) {
            System.out.print("Graph has a cycle\n");
            return 1;
        }

        // 打印拓扑排序结果
        System.out.print("== TopSort: ");
        for (int i = 0; i < num; i++) {
            System.out.printf("%c ", tops[i]);
        }
        System.out.print("\n");

        return 0;
    }

}
