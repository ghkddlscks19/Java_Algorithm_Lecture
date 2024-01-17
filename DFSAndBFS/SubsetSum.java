package DFSAndBFS;

import java.util.Arrays;
import java.util.Scanner;

public class SubsetSum {

    static int n, total = 0;
    static int[] arr;
    static String answer = "NO";

    boolean flag = false;

    public void DFS(int l, int sum) {
        if (flag) {
            return;
        }
        if (l == n) {
            if (total - sum == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(l+1, sum + arr[l]);
            DFS(l+1, sum);
        }
    }

    public static void main(String[] args) {
        SubsetSum t = new SubsetSum();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        t.DFS(0, 0);
        System.out.println(answer);
    }
}
