package RecursiveTreeGraph;

import java.util.Scanner;

public class Pibonacci {

    static int[] pibo;
    public int DFS(int n) {
        if (pibo[n] > 0) {
            return pibo[n];
        }
        if (n == 1) {
            return pibo[n] = 1;
        } else if (n == 2) {
            return pibo[n] = 1;
        } else {
            return pibo[n] = DFS(n - 2) +DFS(n - 1);
        }
    }

    public static void main(String[] args) {
        Pibonacci t = new Pibonacci();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        pibo = new int[n + 1];
        t.DFS(n);

        for (int i = 1; i <= n; i++) {
            System.out.print(pibo[i]+" ");
        }

    }
}
