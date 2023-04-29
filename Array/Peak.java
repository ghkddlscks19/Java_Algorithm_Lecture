package Array;

import java.util.Scanner;

public class Peak {
    public int solution(int arr[][], int N) {
        int answer = 0;


        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i + 1][j]
                        && arr[i][j] >  arr[i][j - 1] && arr[i][j] > arr[i][j + 1]) {
                    answer++;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Peak m = new Peak();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr[][] = new int[N+2][N+2];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(m.solution(arr, N));
    }
}
