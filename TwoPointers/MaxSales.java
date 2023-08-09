package TwoPointers;

import java.util.Scanner;

public class MaxSales {

    public int solution(int arr[], int n, int k) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int result = sum;

        for (int i = 0; i < n; i++) {
            if (k < n) {
                sum += arr[k++] - arr[i];
                answer = Math.max(result, sum);
                result = answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MaxSales t = new MaxSales();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // N일 동안의 매출 기록
        int k = sc.nextInt(); // 연속된 K일 동안의 최대 매출액
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(t.solution(arr, n ,k));

    }
}
