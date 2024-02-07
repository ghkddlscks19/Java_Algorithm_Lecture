package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Schedule implements Comparable<Schedule>{
    int money;
    int time;

    public Schedule(int money, int time) {
        this.money = money;
        this.time = time;
    }

    @Override
    public int compareTo(Schedule o) {
        return o.time - this.time;
    }
}
public class PriorityQueueSchedule {

    static int max = Integer.MIN_VALUE;

    public int solution(int n, ArrayList<Schedule> sd) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int j = 0;

        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if (sd.get(j).time < i) break;
                pq.offer(sd.get(j).money);
            }
            if(!pq.isEmpty()) answer += pq.poll();
        }

        return answer;
    }


    public static void main(String[] args) {
        PriorityQueueSchedule p = new PriorityQueueSchedule();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Schedule> sd = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int t = sc.nextInt();

            sd.add(new Schedule(m, t));
            if (max < t) {
                max = t;
            }
        }

        Collections.sort(sd);

        System.out.println(p.solution(n, sd));
    }
}
