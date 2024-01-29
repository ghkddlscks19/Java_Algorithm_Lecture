package DFSAndBFS;

import java.util.Scanner;

public class FindCombination {

    static int n, r;
    static int combi[];

    public void DFS(int L, int num) {
        if (L == r) {
            for (int x : combi) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = num; i <= n; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }

    }

    public static void main(String[] args) {
        FindCombination t = new FindCombination();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        r = sc.nextInt();

        combi = new int[r];

        t.DFS(0, 1);
    }
}
