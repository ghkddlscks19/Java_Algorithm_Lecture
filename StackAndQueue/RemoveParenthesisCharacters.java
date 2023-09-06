package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class RemoveParenthesisCharacters {

    public String solution(String s) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == ')') {
                while (stack.pop() != '(');
            } else stack.push(c);
        }

        for (char c : stack) {
            answer += c;
        }


        return answer;
    }

    public static void main(String[] args) {
        RemoveParenthesisCharacters t = new RemoveParenthesisCharacters();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(t.solution(s));
    }
}
