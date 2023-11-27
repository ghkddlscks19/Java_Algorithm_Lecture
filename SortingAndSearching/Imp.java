package SortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Imp {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int cpyarr[] = new int[n];

        for (int i = 0; i < n; i++) {
            cpyarr[i] = arr[i];
        }
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (arr[i] != cpyarr[i]) {
                answer.add(i+1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Imp t = new Imp();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : t.solution(n, arr)) {
            System.out.print(x+" ");
        }
    }
}
