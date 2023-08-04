package TwoPointers;

import java.util.*;

public class FindCommonElements {

    public ArrayList<Integer> solution(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (arr1[i]==arr2[j]){
                answer.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i]<arr2[j]) {
                i++;
            }else {
                j++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        FindCommonElements t = new FindCommonElements();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int arr2[] = new int[m];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int x : t.solution(arr1, arr2, n, m)) {
            System.out.print(x+" ");
        }
    }
}
