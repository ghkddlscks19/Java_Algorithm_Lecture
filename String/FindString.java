package String;

import java.util.Scanner;

public class FindString {

    public int solution(String str, String findStr) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == findStr.charAt(0)) {
                num++;
            }
        }
        return num;
    }


    public static void main(String[] args) {
        FindString findString = new FindString();
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        String findStr = sc.next().toLowerCase();
        System.out.println(findString.solution(str, findStr));
    } 
}
