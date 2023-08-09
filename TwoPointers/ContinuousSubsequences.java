package TwoPointers;

import java.util.Scanner;

public class ContinuousSubsequences {

    public int solution(int arr[], int n, int m) {
        int answer = 0;
        int sum = 0;
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) {
                answer++;
            }
            while (sum >= m) {
                sum -= arr[lt];
                lt++;
                if (sum == m) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ContinuousSubsequences t = new ContinuousSubsequences();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 숫자 개수
        int m = sc.nextInt(); // 연속 부분 수열의 합
        int arr[] = new int[n]; // 담을 배열

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(t.solution(arr, n, m));
    }
}
