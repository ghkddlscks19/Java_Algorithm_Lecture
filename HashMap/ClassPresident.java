package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ClassPresident {

    public char solution(int n, String str) {
        char answer = ' ';
        int max = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
        }

        for (char key : hashMap.keySet()) {
            if(hashMap.get(key) > max){
                max = hashMap.get(key);
                answer = key;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        ClassPresident t = new ClassPresident();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(t.solution(n, str));
    }
}
