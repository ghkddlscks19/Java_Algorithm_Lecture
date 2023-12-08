package RecursiveTreeGraph;

import java.util.ArrayList;
import java.util.Scanner;

public class PathSearchList {

    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void DFS(int v) {

        if (v == n) {
            answer++;
        } else {
            for (int next : graph.get(v)) {
                if (ch[next] == 0) {
                    ch[next] = 1;
                    DFS(next);
                    ch[next] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        PathSearchList t = new PathSearchList();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        ch = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            graph.get(v1).add(v2);
        }

        ch[1] = 1;
        t.DFS(1);
        System.out.println(answer);

    }
}
