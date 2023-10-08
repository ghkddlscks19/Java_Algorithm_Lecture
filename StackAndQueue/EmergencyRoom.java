package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int id;
    int dangerous;

    public Person(int id, int dangerous) {
        this.id = id;
        this.dangerous = dangerous;
    }
}
public class EmergencyRoom {
    public int solution(int n, int m, int[] patient) {
        int answer = 1;
        Queue<Person> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.offer(new Person(i, patient[i]));
        }

        while (!q.isEmpty()) {
            Person tmp = q.poll();
            for (Person x : q) {
                if (x.dangerous > tmp.dangerous) {
                    q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                if (tmp.id == m) {
                    break;
                } else {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        EmergencyRoom t = new EmergencyRoom();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int patient[] = new int[n];

        for (int i = 0; i < n; i++) {
            patient[i] = sc.nextInt();
        }

        System.out.println(t.solution(n, m, patient));
    }
}
