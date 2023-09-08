package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class ClawMachineGame {

    public int solution(int n, int board[][], int m, int moves[]) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int location : moves) {
            for (int i = 0; i < n; i++) {
                if (board[i][location - 1] != 0) {
                    int tmp = board[i][location - 1];
                    board[i][location - 1] = 0;
                    if (!stack.isEmpty() && stack.peek() == tmp) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(tmp);
                    }
                    break;
                }

            }
        }

        return answer;
    }

    public static void main(String[] args) {

        ClawMachineGame t = new ClawMachineGame();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int board[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int moves[] = new int[m];

        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }

        System.out.println(t.solution(n, board, m, moves));
    }
}
