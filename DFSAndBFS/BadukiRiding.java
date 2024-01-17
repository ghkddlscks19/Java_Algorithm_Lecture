package DFSAndBFS;

import java.util.Scanner;

public class BadukiRiding {

    static int c, n, answer = 0, max = 0;
    static int arr[];

    public void DFS(int l, int sum) {
        if (l == n) {
            if (c > sum) {
                if (max < sum) {
                    max = sum;
                }
                answer = max;
            }
        } else {
            DFS(l + 1, sum + arr[l]);
            DFS(l + 1, sum);
        }
    }

    public static void main(String[] args) {
        BadukiRiding t = new BadukiRiding();
        Scanner sc = new Scanner(System.in);

        c = sc.nextInt();
        n = sc.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        t.DFS(0, 0);

        System.out.println(answer);
    }
}
