package String;

import java.util.Scanner;

public class ReverseSpecificCharacters {
    public String solution(String str) {
        String answer = "";
        char arr[] = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;
        char tmp;
        while (lt < rt) {
            if (!((arr[lt] >= 'a' && arr[lt] <= 'z') || (arr[lt] >= 'A' && arr[lt] <= 'Z'))) {
                lt++;
            } else if (!((arr[rt] >= 'a' && arr[rt] <= 'z') || (arr[rt] >= 'A' && arr[rt] <= 'Z'))) {
                rt--;
            }else {
                tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(arr);
        return answer;
    }


    public static void main(String[] args) {
        ReverseSpecificCharacters m = new ReverseSpecificCharacters();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(m.solution(str));
    }
}
