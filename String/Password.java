package String;

import java.util.Scanner;

public class Password {
    public String solution(String str, int num) {
        String answer = "";

        for (int i = 0; i < num; i++) {
            String tmp = str.substring(0,7).replace("#", "1").replace("*", "0");
            System.out.println(tmp);
            int n = Integer.parseInt(tmp, 2);
            answer += (char) n;
            str = str.substring(7);
        }

        return answer;

    }


    public static void main(String[] args) {
        Password m = new Password();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        System.out.println(m.solution(str, num));
    }
}
