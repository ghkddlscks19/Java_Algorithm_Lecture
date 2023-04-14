package String;

import java.util.Scanner;

public class WordInSentence {
    public String solution(String str) {
        String answer = "";
        String[] strArr = str.split(" ");
        int num = 0;

        for (String s: strArr) {
            int len = s.length();
            if (len > num) {
                num = len;
                answer = s;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        WordInSentence m = new WordInSentence();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(m.solution(str));
    }
}
