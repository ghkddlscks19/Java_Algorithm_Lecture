package DFSAndBFS;

import java.util.Scanner;

public class Permutation2 {

    static int n, m;
    static int arr[], pm[], check[];

    public void DFS(int L) {
        if (L == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(pm[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    pm[L] = arr[i];
                    DFS(L + 1);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Permutation2 t = new Permutation2();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];
        check = new int[n];
        pm = new int[m];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        t.DFS(0);
    }
}
