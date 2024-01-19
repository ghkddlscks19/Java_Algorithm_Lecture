package DFSAndBFS;

import java.util.Scanner;

public class Permutation {

    static int n, m;
    static int pm[];

    public void DFS(int l) {
        if (l == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(pm[i]+ " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[l] = i;
                DFS(l + 1);
            }
        }
    }

    public static void main(String[] args) {
        Permutation t = new Permutation();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];

        t.DFS(0);

    }
}
