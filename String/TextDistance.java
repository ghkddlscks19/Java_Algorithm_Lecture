package String;

import java.util.Scanner;

public class TextDistance {
    public int[] solution(String str, char t) {
        int[] answer = new int[str.length()];
        int p = 1000;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                if (answer[i] > p) {
                    p++;
                    answer[i] = p;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        TextDistance m = new TextDistance();
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        char t = sc.next().toLowerCase().charAt(0);
        for (int x : m.solution(str, t)) {
            System.out.print(x + " ");
        }
    }
}
