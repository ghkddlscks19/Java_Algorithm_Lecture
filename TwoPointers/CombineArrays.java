package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CombineArrays {

    public ArrayList<Integer> solution(int arr1[], int arr2[]) {
        ArrayList<Integer> answer = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                answer.add(arr1[i]);
                i++;
            } else {
                answer.add(arr2[j]);
                j++;
            }
        }

        while (j < arr2.length) {
            answer.add(arr2[j]);
            j++;
        }

        while (i < arr1.length) {
            answer.add(arr1[i]);
            i++;
        }

        return answer;

    }

    public static void main(String[] args) {
        CombineArrays t = new CombineArrays();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for (int j = 0; j < m; j++) {
            arr2[j] = sc.nextInt();
        }

        for (int x : t.solution(arr1, arr2)) {
            System.out.print(x+" ");
        }
    }
}
