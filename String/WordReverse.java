package String;

import java.util.Scanner;

public class WordReverse {
    public String solution(String str) {
        String answer = "";
        for (int i = str.length()-1; i >= 0; i--) {
            answer += String.valueOf(str.charAt(i));
        }
        return answer;
    }


    public static void main(String[] args) {
        WordReverse m = new WordReverse();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            String str = sc.next();
            System.out.println(m.solution(str));
        }
    }

}
