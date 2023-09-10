package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {

    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(x == '+') stack.push(lt + rt);
                else if(x == '-') stack.push(lt - rt);
                else if(x == '*') stack.push(lt * rt);
                else stack.push(lt / rt);
            }
        }

        answer = stack.get(0);

        return answer;
    }

    public static void main(String[] args) {
        Postfix t = new Postfix();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(t.solution(s));
    }
}
