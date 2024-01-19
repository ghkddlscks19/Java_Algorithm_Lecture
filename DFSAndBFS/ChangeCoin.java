package DFSAndBFS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ChangeCoin {

    static int n, m, answer = Integer.MAX_VALUE;
    static int coin[];

    public void DFS(int L, int sum, Integer[] arr) {
        if (sum > m) {
            return;
        } else if (L >= answer) {
            return;
        } else if (sum == m) {
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(L + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        ChangeCoin t = new ChangeCoin();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }
        Integer arr[] = Arrays.stream(coin).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());

        m = sc.nextInt();

        t.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
