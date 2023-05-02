package Array;

import java.util.Scanner;

public class ChoiceClassPresident {
    public int solution(int arr[][], int N) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (max < count) {
                max = count;
                answer = i+1;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        ChoiceClassPresident m = new ChoiceClassPresident();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr[][] = new int[N][5];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(m.solution(arr, N));
    }
}
