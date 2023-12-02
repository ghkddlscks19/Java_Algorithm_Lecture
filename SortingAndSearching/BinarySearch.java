package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int start = 0;
        int end = n-1;
        int middle = (start + end) / 2;

        Arrays.sort(arr);

        while (true) {
            if (arr[middle] == m) {
                answer = middle + 1;
                break;
            } else if (arr[middle] < m) {
                start = middle;
                middle = (start + end) / 2;
            } else {
                end = middle;
                middle = (start + end) / 2;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        BinarySearch t = new BinarySearch();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(t.solution(n, m, arr));
    }
}
