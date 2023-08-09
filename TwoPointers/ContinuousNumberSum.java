package TwoPointers;

import java.util.Scanner;

public class ContinuousNumberSum {

    public int solution(int n) {
        int answer = 0;
        int lt = 1;
        int sum = 0;

        for (int rt = 1; rt < n; rt++) {
            sum += rt;
            if (sum == n) {
                answer++;
            }
            while (sum >= n) {
                sum -= lt;
                lt++;
                if (sum == n) {
                    answer++;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        ContinuousNumberSum t = new ContinuousNumberSum();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(t.solution(n));
    }
}
