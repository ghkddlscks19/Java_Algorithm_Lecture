package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeCoins {

    public int solution(int n, int m, int coin[]) {
        int answer = 0;

        int dp[] = new int[m + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;


        for (int i = 0; i < n; i++) {
            for (int j = coin[i]; j <= m; j++) {
                dp[j] = Math.min(dp[j], dp[j - coin[i]] + 1);
            }
        }

        answer = dp[m];

        return answer;
    }

    public static void main(String[] args) {
        ChangeCoins t = new ChangeCoins();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int coin[] = new int[n];

        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        System.out.println(t.solution(n, m, coin));

    }
}
