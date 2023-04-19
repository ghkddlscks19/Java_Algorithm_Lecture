package String;

import java.util.Scanner;

public class StringCompression {
    public String solution(String str) {
        String answer = "";
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                answer += str.charAt(i);
                if (count > 1) {
                    answer += count;
                    count = 1;
                }
            }
        }

        return answer;

    }


    public static void main(String[] args) {
        StringCompression m = new StringCompression();
        Scanner sc = new Scanner(System.in);
        String str = sc.next()+" ".toUpperCase();
        System.out.println(m.solution(str));
    }
}
