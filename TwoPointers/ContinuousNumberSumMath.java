package TwoPointers;

import java.util.Scanner;

public class ContinuousNumberSumMath {

    public int solution(int n) {
        int answer = 0;
        int minus = 3;

        for (int i = 2; i < n; i++) {
            if (minus > n) {
                break;
            }
            if((n-minus) % i == 0) {
                answer++;
            }
            minus += i+1;
        }

        return answer;
    }

    public static void main(String[] args) {
        ContinuousNumberSumMath t = new ContinuousNumberSumMath();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(t.solution(n));
    }
}
