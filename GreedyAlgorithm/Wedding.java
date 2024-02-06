package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class WeddingTime implements Comparable<WeddingTime>{
    int time;
    char state;


    public WeddingTime(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(WeddingTime o) {
        if (this.time == o.time) {
            return this.state - o.state;
        } else {
            return this.time - o.time;
        }
    }
}

public class Wedding {

    static ArrayList<WeddingTime> wt;

    public int solution() {
        int answer = 0;
        int cnt = 0;

        for (WeddingTime weddingTime : wt) {
            if (weddingTime.state == 's') {
                cnt++;
            } else {
                cnt--;
            }
            answer = Math.max(answer, cnt);
        }

        return answer;
    }

    public static void main(String[] args) {
        Wedding t = new Wedding();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        wt = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();

            wt.add(new WeddingTime(s, 's'));
            wt.add(new WeddingTime(e, 'e'));
        }

        Collections.sort(wt);

        System.out.println(t.solution());
    }
}
