package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CurriculumDesign {

    public String solution(String essential, String subject) {
        String answer = "YES";
        Queue<Character> q = new LinkedList<>();

        for (char x : essential.toCharArray()) {
            q.offer(x);
        }

        for (char x : subject.toCharArray()) {
            if (q.contains(x)) {
                if (x != q.poll()) {
                    answer = "NO";
                }
            }
        }

        if(!q.isEmpty()) answer = "NO";

        return answer;
    }

    public static void main(String[] args) {
        CurriculumDesign t = new CurriculumDesign();
        Scanner sc = new Scanner(System.in);

        String essential = sc.next();
        String subject = sc.next();

        System.out.println(t.solution(essential, subject));
    }
}
