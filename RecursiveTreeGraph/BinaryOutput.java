package RecursiveTreeGraph;

import java.util.Scanner;

public class BinaryOutput {

    public void DFS(int n) {
        if (n < 1) {
            return;
        } else {
            DFS(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        BinaryOutput t = new BinaryOutput();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        t.DFS(n);
    }
}
