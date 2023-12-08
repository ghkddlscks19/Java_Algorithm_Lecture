package RecursiveTreeGraph;

import java.util.LinkedList;
import java.util.Queue;

class NodeB {
    int data;
    NodeB lt, rt;

    public NodeB(int data) {
        this.data = data;
        lt = rt = null;
    }
}

public class TreeShortestRootBFS {

    NodeB root;

    public int BFS(NodeB root) {
        int l = 0;
        Queue<NodeB> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                NodeB poll = q.poll();
                if (poll.lt == null && poll.rt == null) {
                    return l;
                }
                if (poll.lt != null) {
                    q.offer(poll.lt);
                }
                if (poll.rt != null) {
                    q.offer(poll.rt);
                }
            }
            l++;
        }
        return 0;
    }

    public static void main(String[] args) {
        TreeShortestRootBFS tree = new TreeShortestRootBFS();
        tree.root = new NodeB(1);
        tree.root.lt = new NodeB(2);
        tree.root.rt = new NodeB(3);
        tree.root.lt.lt = new NodeB(4);
        tree.root.lt.rt = new NodeB(5);

        System.out.println(tree.BFS(tree.root));
    }
}
