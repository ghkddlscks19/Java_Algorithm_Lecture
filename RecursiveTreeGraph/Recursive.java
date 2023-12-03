package RecursiveTreeGraph;

import java.util.Scanner;

public class Recursive {

    public void DFS (int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Recursive t = new Recursive();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        t.DFS(n);
    }
}
