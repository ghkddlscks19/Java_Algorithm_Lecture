package String;

import java.util.Scanner;

public class RemoveDuplicateCharacters {
    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        RemoveDuplicateCharacters m = new RemoveDuplicateCharacters();
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        System.out.println(m.solution(str));
    }
}
