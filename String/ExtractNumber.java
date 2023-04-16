package String;

import java.util.Scanner;

public class ExtractNumber {
    public int solution(String str) {
        int answer = 0;
        str = str.replaceAll("[a-z]","");
        answer = Integer.parseInt(str);

        return answer;
    }


    public static void main(String[] args) {
        ExtractNumber m = new ExtractNumber();
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        System.out.println(m.solution(str));
    }
}
