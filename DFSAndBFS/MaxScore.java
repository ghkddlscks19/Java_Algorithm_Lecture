package DFSAndBFS;

import java.util.Scanner;

public class MaxScore {

    static int n, m, max = 0;
    static int[] pr, min;

    public void DFS(int l, int score, int time) {
        if (l == n) {
            if (m < time) {
                return;
            }
            if (max < score) {
                max = score;
            }
        }
        else {
            DFS(l + 1, score + pr[l], time + min[l]);
            DFS(l + 1, score, time);
        }
    }

    public static void main(String[] args) {
        MaxScore t = new MaxScore();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        pr = new int[n];
        min = new int[n];


        for (int i = 0; i < n; i++) {
            pr[i] = sc.nextInt();
            min[i] = sc.nextInt();
        }

        t.DFS(0, 0, 0);
        System.out.println(max);
    }
}
