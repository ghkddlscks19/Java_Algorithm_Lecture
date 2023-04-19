package Array;

import java.util.Scanner;

public class VisibleStudent {

    public int solution(int arr[], int num) {
        int answer = 0;
        int max = 0;

        for (int i = 0; i < num; i++) {
            if (arr[i] > max) {
                max = arr[i];
                answer++;
            }
        }
        return answer;

    }


    public static void main(String[] args) {
        VisibleStudent m = new VisibleStudent();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int arr[] = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(m.solution(arr, num));
    }
}
