package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class BigNumberOutput {

    public ArrayList<Integer> solution(int arr[], int num) {
        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(arr[0]);

        for (int i = 1; i < num; i++) {
            if (arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
            }
        }

        return answer;

    }


    public static void main(String[] args) {
        BigNumberOutput m = new BigNumberOutput();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : m.solution(arr, num)) {
            System.out.print(x + " ");
        }

    }
}
