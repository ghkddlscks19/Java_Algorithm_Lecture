import java.util.Scanner;

public class Main {
    public int solution(String str) {
        int answer = 0;
        str = str.replaceAll("[a-z]","");
        answer = Integer.parseInt(str);

        return answer;
    }


    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        System.out.println(m.solution(str));
    }
}
