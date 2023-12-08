package RecursiveTreeGraph;

class NodeD {
    int data;
    NodeD lt, rt;

    public NodeD(int data) {
        this.data = data;
        lt = rt = null;
    }
}

public class TreeShortestRootDFS {

    NodeD root;

    public int DFS(int l, NodeD root) {
        if (root.lt == null && root.rt == null) {
            return l;
        } else {
            return Math.min(DFS(l+1, root.lt), DFS(l+1, root.rt));
        }

    }

    public static void main(String[] args) {
        TreeShortestRootDFS tree = new TreeShortestRootDFS();
        tree.root = new NodeD(1);
        tree.root.lt = new NodeD(2);
        tree.root.rt = new NodeD(3);
        tree.root.lt.lt = new NodeD(4);
        tree.root.lt.rt = new NodeD(5);

        System.out.println(tree.DFS(0,tree.root));
    }
}
