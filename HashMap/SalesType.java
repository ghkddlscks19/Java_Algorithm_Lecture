package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SalesType {

    public ArrayList<Integer> solution(int n, int k, int arr[]) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            hashMap.put(arr[rt], hashMap.getOrDefault(arr[rt], 0) + 1);
            answer.add(hashMap.size());
            hashMap.put(arr[lt], hashMap.get(arr[lt]) - 1);
            if (hashMap.get(arr[lt]) == 0) {
                hashMap.remove(arr[lt]);
            }
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        SalesType t = new SalesType();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : t.solution(n, k, arr)) {
            System.out.print(x + " ");
        }

    }
}
