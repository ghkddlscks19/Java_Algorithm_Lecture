package String;

import java.util.Scanner;

public class PalindromeString {
    public String solution(String str) {
        String answer = "YES";
        char arr[] = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if (arr[lt] != arr[rt]) {
                answer = "NO";
                break;
            } else {
                lt++;
                rt--;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        PalindromeString m = new PalindromeString();
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        System.out.println(m.solution(str));
    }
}
