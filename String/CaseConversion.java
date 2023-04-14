package String;

import java.util.Scanner;

public class CaseConversion {
    public String solution(String str) {
        String tmp = "";
        for(int i =0; i<str.length(); i++){
            if (str.charAt(i) >= 'a' && str.charAt(i) < 'z') {
                tmp += String.valueOf(str.charAt(i)).toUpperCase();
            } else {
                tmp += String.valueOf(str.charAt(i)).toLowerCase();
            }
        }
        return tmp;
    }


    public static void main(String[] args) {
        CaseConversion m = new CaseConversion();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(m.solution(str));
    }
} 
