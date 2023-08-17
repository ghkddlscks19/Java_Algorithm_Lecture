package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

    public String solution(String str1, String str2) {
        String answer = "";
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char x : str1.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }

        for (char x : str2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        for (char key : map1.keySet()) {
            if (map1.get(key) == map2.get(key)) {
                answer = "YES";
            } else {
                answer = "NO";
                break;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Anagram t = new Anagram();
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(t.solution(str1, str2));
    }
}
