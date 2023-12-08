package RecursiveTreeGraph;

import java.util.ArrayList;
import java.util.Scanner;

public class PathSearchDFS {
    static int n, m, answer;
    static int ch[];
    static int graph[][];

    public void DFS(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0 && graph[v][i] == 1) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }

        }
    }

    public static void main(String[] args) {
        PathSearchDFS t = new PathSearchDFS();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n + 1][n + 1];
        ch = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            graph[v1][v2] = 1;
        }

        ch[1] = 1;
        t.DFS(1);
        System.out.println(answer);

    }
}
