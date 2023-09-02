package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class AllAnagram {

    public int solution(String s, String t) {
        int answer = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        HashMap<Character, Integer> hashMapt = new HashMap<>();

        for (char x : t.toCharArray()) {
            hashMapt.put(x, hashMapt.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < t.length() - 1; i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        int lt = 0;

        for (int rt = t.length() - 1; rt < s.length(); rt++) {
            hashMap.put(s.charAt(rt), hashMap.getOrDefault(s.charAt(rt), 0) + 1);
            if(hashMap.equals(hashMapt)) {
                answer++;
            }
            hashMap.put(s.charAt(lt), hashMap.get(s.charAt(lt)) - 1);
            if (hashMap.get(s.charAt(lt)) == 0) {
                hashMap.remove(s.charAt(lt));
            }
            lt++;
        }



        return answer;
    }

    public static void main(String[] args) {
        AllAnagram T = new AllAnagram();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();
        System.out.println(T.solution(s, t));
    }
}
