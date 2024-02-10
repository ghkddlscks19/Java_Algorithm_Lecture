package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class WonderlandEdge implements Comparable<WonderlandEdge>{
    int vex;
    int cost;

    public WonderlandEdge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(WonderlandEdge o) {
        return this.cost - o.cost;
    }
}

public class WonderlandPriorityQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int e = sc.nextInt();

        ArrayList<ArrayList<WonderlandEdge>> arrayList = new ArrayList<>();
        int ch[] = new int[v + 1];

        for (int i = 0; i <= v; i++) {
            arrayList.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arrayList.get(a).add(new WonderlandEdge(b, c));
            arrayList.get(b).add(new WonderlandEdge(a, c));
        }

        int answer = 0;
        PriorityQueue<WonderlandEdge> pq = new PriorityQueue<>();
        pq.offer(new WonderlandEdge(1, 0));
        while (!pq.isEmpty()) {
            WonderlandEdge poll = pq.poll();
            int ev = poll.vex;
            if (ch[ev] == 0) {
                ch[ev] = 1;
                answer += poll.cost;
                for (WonderlandEdge wonderlandEdge : arrayList.get(ev)) {
                    pq.offer(new WonderlandEdge(wonderlandEdge.vex, wonderlandEdge.cost));
                }
            }
        }
        System.out.println(answer);
    }
}
