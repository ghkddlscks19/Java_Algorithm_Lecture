package Array;

import java.util.Scanner;

public class Eratosthenes {

    public int solution(int arr[], int num) {
        int answer = 0;

        for (int i = 2; i <= num; i++) {
            if(arr[i] == 0) continue;
            for (int j = 2*i; j <= num; j+=i) {
                arr[j] = 0;
            }
        }

        for (int i = 2; i <= num; i++) {
            if (arr[i] != 0) {
                answer++;
            }
        }


        return answer;

    }


    public static void main(String[] args) {
        Eratosthenes m = new Eratosthenes();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int arr[] = new int[num + 1];

        for (int i = 2; i <= num; i++) {
            arr[i] = i;
        }

        System.out.println(m.solution(arr, num));
    }
}
