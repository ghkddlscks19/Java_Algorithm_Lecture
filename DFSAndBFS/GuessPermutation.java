package DFSAndBFS;

import java.util.Scanner;

public class GuessPermutation {

    static int p[], b[], dy[][], ch[];
    static int n, f;

    static boolean flag = false;

    public void DFS(int L, int sum) {
        if (flag == true) {
            return;
        }
        if (L == n) {
            if (sum == f) {
                for (int x : p) {
                    System.out.print(x + " ");
                }
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L + 1, sum + (p[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }
    }

    public int combi(int n, int r) {
        if (dy[n][r] > 0) {
            return dy[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        } else {
            return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
        }
    }

    public static void main(String[] args) {
        GuessPermutation t = new GuessPermutation();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        f = sc.nextInt();

        p = new int[n];
        b = new int[n];
        ch = new int[n + 1];

        dy = new int[n + 1][n + 1];

        for (int i = 0; i < n; i++) {
            b[i] = t.combi(n-1, i);
        }

        t.DFS(0, 0);
    }
}
