package SortingAndSearching;

import java.util.Scanner;

public class MusicVideo {

    public int max(int arr[]) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public int decision(int arr[], int m, int capacity) {
        int cnt = 1;
        int sum = 0;
        for (int i : arr) {
            if (sum + i > capacity) {
                cnt++;
                sum = i;
            } else {
                sum += i;
            }

        }
        return cnt;
    }

    public int solution(int n, int m, int[] arr) {
        int answer = Integer.MAX_VALUE;
        int lt = arr[n - 1]; // int lt = Arrays.stream(arr).max.getAsint();
        int rt = max(arr); // int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (decision(arr, m, mid) <= m) {
                rt = mid - 1;
                answer = mid;
            } else {
                lt = mid + 1;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        MusicVideo t = new MusicVideo();
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
