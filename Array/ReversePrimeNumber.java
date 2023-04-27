package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversePrimeNumber {
    public ArrayList<Integer> solution(int arr[], int num) {
        ArrayList<Integer> answer = new ArrayList<>();


        for (int i = 0; i < num; i++) {
            int temp = 0;
            while (arr[i] != 0) {
                temp = temp * 10 + arr[i] % 10;
                arr[i] /= 10;
            }
            arr[i] = temp;
        }

        for (int i = 0; i < num; i++) {
            if (isPrime(arr[i]) == true) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        ReversePrimeNumber m = new ReversePrimeNumber();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int arr[] = new int[num];

        for(int i =0; i<num; i++){
            arr[i] = sc.nextInt();
        }

        for (int x : m.solution(arr, num)) {
            System.out.print(x + " ");
        }
    }
}
