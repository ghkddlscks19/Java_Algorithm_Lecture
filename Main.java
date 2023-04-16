import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "YES";
        str = str.replaceAll("[^a-z0-9]","");
        int lt = 0;
        int rt = str.length() - 1;
        char arr[] = str.toCharArray();
        while (lt < rt) {
            if (arr[lt] != arr[rt]) {
                answer = "NO";
                break;
            } else {
                lt++;
                rt--;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        System.out.println(m.solution(str));
    }
}
