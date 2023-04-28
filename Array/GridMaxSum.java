package Array;

import java.util.Scanner;

public class GridMaxSum {
    public int solution(int arr[][], int N) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0; // 합

        // 각 행 중 최대합 구하기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sum += arr[j][i];
            }
            if (max < sum) {
                max = sum;
            }
            sum = 0;
        }

        // 각 열 중 최대합 구하기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sum += arr[i][j];
            }
            if (max < sum) {
                max = sum;
            }
            sum = 0;
        }

        // 왼쪽 대각선 최대합 구하기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        if (max < sum) {
            max = sum;
        }
        sum = 0;

        // 오른쪽 대각선 최대합 구하기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i+j == N){
                    sum += arr[i][j];
                }
            }
        }
        if (max < sum) {
            max = sum;
        }

        answer = max;

        return answer;
    }


    public static void main(String[] args) {
        GridMaxSum m = new GridMaxSum();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(m.solution(arr, N));
    }
}
