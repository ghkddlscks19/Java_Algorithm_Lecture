package RecursiveTreeGraph;

import java.util.LinkedList;
import java.util.Queue;

class NodeBFS {
    int data;
    NodeBFS lt, rt;

    public NodeBFS(int data) {
        this.data = data;
        lt = rt = null;
    }
}

public class BinaryTreeTraverseBFS {

    NodeBFS root;

    public void BFS(NodeBFS root) {

        Queue<NodeBFS> q = new LinkedList<>();
        q.offer(root);
        int l = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            System.out.print(l+" : ");
            for (int i = 0; i < len; i++) {
                NodeBFS curr = q.poll();
                System.out.print(curr.data+" ");
                if (curr.lt != null) {
                    q.offer(curr.lt);
                }
                if (curr.rt != null) {
                    q.offer(curr.rt);
                }
            }
            l++;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        BinaryTreeTraverseBFS tree = new BinaryTreeTraverseBFS();
        tree.root = new NodeBFS(1);
        tree.root.lt = new NodeBFS(2);
        tree.root.rt = new NodeBFS(3);
        tree.root.lt.lt = new NodeBFS(4);
        tree.root.lt.rt = new NodeBFS(5);
        tree.root.rt.lt = new NodeBFS(6);
        tree.root.rt.rt = new NodeBFS(7);

        tree.BFS(tree.root);
    }
}
