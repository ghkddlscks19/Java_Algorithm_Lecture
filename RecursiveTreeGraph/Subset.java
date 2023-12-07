package RecursiveTreeGraph;

import java.util.Scanner;

public class Subset {
    static int n;
    static int ch[];

    public void DFS(int l) {
        if (l == n + 1) {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        } else {
            ch[l] = 1;
            DFS(l + 1);
            ch[l] = 0;
            DFS(l + 1);
        }

    }

    public static void main(String[] args) {
        Subset t = new Subset();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        ch = new int[n + 1];
        t.DFS( 1);

    }
}
