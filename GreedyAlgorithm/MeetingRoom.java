package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
    int start, end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o) {
        if (this.end == o.end) {
            return this.start - o.start;
        } else {
            return this.end - o.end;
        }
    }
}

public class MeetingRoom {

    static ArrayList<Time> mt;

    public int solution(int n) {
        int answer = 1;
        int maxTime = mt.get(0).end;

        for (int i = 1; i < n; i++) {
            if (maxTime <= mt.get(i).start) {
                maxTime = mt.get(i).end;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MeetingRoom t = new MeetingRoom();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        mt = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            mt.add(new Time(s, e));
        }

        Collections.sort(mt);

        System.out.println(t.solution(n));

    }
}
