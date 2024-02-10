package DynamicProgramming;

import java.util.Scanner;

public class CrossStoneBridge {

    public int solution(int n) {
        int answer = 0;
        int dp[] = new int[n + 2];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n + 1; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        answer = dp[n + 1];
        return answer;
    }

    public static void main(String[] args) {
        CrossStoneBridge t = new CrossStoneBridge();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(t.solution(n));
    }
}
