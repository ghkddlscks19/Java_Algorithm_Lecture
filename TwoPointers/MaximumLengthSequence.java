package TwoPointers;

import java.util.Scanner;

public class MaximumLengthSequence {

    public int solution(int arr[], int n, int k) {
        int answer = 0;
        int max = 0; // 최대 길이
        int cnt = 0; // 길이
        int zerocnt = 0; // 0의 갯수
        int lt = 1;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) {
                zerocnt++;
            }
            if (zerocnt > k) {
                cnt--;
                if (max < cnt) {
                    max = cnt;
                }
                zerocnt = 0;
                cnt = 0;
                rt = lt++;
            }
            cnt++;
        }
        answer = max;

        return answer;
    }

    public static void main(String[] args) {
        MaximumLengthSequence t = new MaximumLengthSequence();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 수의 개수
        int k = sc.nextInt(); // 변경할 수 있는 k의 개수

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(t.solution(arr, n, k));
    }
}
