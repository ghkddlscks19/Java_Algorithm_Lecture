package RecursiveTreeGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphShortestPath {
    static int n, m;
    static int[] dis, ch;
    static ArrayList<ArrayList<Integer>> graph;

    public void BFS(int v) {

        Queue<Integer> q = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        q.offer(v);

        while (!q.isEmpty()) {
            int curr = q.poll();
            for (int next : graph.get(curr)) {
                if (ch[next] == 0) {
                    ch[next] = 1;
                    dis[next] = dis[curr] + 1;
                    q.offer(next);
                }
            }
        }

        // 처음에 배운 정석 방법(숙제)
//        int l = 0;
//        while (!q.isEmpty()) {
//            int len = q.size();
//            for (int i = 0; i < len; i++) {
//                int curr = q.poll();
//
//                for (int next : graph.get(curr)) {
//                    if (ch[next] == 0) {
//                        ch[next] = 1;
//                        dis[next] = l+1;
//                        q.offer(next);
//                    }
//                }
//            }
//            l++;
//        }

    }

    public static void main(String[] args) {
        GraphShortestPath t = new GraphShortestPath();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        ch = new int[n + 1];
        dis = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }


        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        t.BFS(1);

        for (int i = 2; i <= n; i++) {
            System.out.println(i + ": " + dis[i]);
        }

    }

}
