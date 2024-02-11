package DynamicProgramming;

import java.util.Scanner;

public class LongestIncreasingSubsequence {

    public int solution(int n, int[] arr) {
        int answer = 0;
        int dp[] = new int[n + 1];

        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i] && dp[j] > max) {
                    max = dp[j];
                }
            }
            dp[i] = max + 1;
            answer = Math.max(answer, dp[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        LongestIncreasingSubsequence t = new LongestIncreasingSubsequence();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(t.solution(n, arr));
    }
}
