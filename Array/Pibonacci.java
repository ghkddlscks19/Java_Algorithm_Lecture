package Array;

import java.util.Scanner;

public class Pibonacci {

    public int[] solution(int num) {
        int[] answer = new int[num];

        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < num; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;

    }


    public static void main(String[] args) {
        Pibonacci m = new Pibonacci();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int x: m.solution(num)) {
            System.out.print(x + " ");
        }
    }
}
