package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class RockPaperScissors {
    public ArrayList<String> solution(int arr[][], int num) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            if ((arr[i][0] - arr[i][1] == 1) || (arr[i][0] - arr[i][1] == -2)) {
                answer.add("A");
            } else if (arr[i][0] == arr[i][1]) {
                answer.add("D");
            } else {
                answer.add("B");
            }
        }

        return answer;

    }


    public static void main(String[] args) {
        RockPaperScissors m = new RockPaperScissors();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int arr[][] = new int[num][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < num; j++) {
                arr[j][i] = sc.nextInt();
            }
        }

        for (String x : m.solution(arr, num)) {
            System.out.println(x);
        }

    }
}
