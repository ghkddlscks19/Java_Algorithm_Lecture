package GreedyAlgorithm;

import java.util.*;

class Physical implements Comparable<Physical> {
    int h, w;

    public Physical(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Physical o) {
        if (this.w == o.w) {
            return this.w - o.w;
        } else {
            return o.h - this.h;
        }
    }
}

public class Wrestler {

    static ArrayList<Physical> wp;

    public int solution(int n) {
        int answer = 1;
        int max = wp.get(0).w;
        for (int i = 1; i < n; i++) {
            if (max < wp.get(i).w) {
                max = wp.get(i).w;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Wrestler t = new Wrestler();
        Scanner sc = new Scanner(System.in);

        wp = new ArrayList<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();

            wp.add(new Physical(height, weight));
        }
        Collections.sort(wp);

        System.out.println(t.solution(n));
    }
}
