package RecursiveTreeGraph;

import java.util.Scanner;

public class Factorial {

    public int DFS(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * DFS(n - 1);
        }
    }

    public static void main(String[] args) {
        Factorial t = new Factorial();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(t.DFS(n));
    }
}
