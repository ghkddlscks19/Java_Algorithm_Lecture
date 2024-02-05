package DFSAndBFS;

import java.util.ArrayList;
import java.util.Scanner;

class PizzaPoint {
    int x, y;

    public PizzaPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Pizza {

    static int n, m, len;

    static int combi[];

    static int answer = Integer.MAX_VALUE;

    static ArrayList<PizzaPoint> house, pizza;

    public void DFS(int L, int start) {
        if (L == m) {
            int sum = 0;
            for (PizzaPoint h : house) {
                int dis = Integer.MAX_VALUE;
                for (int x : combi) {
                    dis = Math.min(dis, Math.abs(h.x - pizza.get(x).x) + Math.abs(h.y - pizza.get(x).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = start; i < len; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }

    }

    public static void main(String[] args) {
        Pizza t = new Pizza();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        house = new ArrayList<>();
        pizza = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int board = sc.nextInt();
                if (board == 1) {
                    house.add(new PizzaPoint(i, j));
                } else if (board == 2) {
                    pizza.add(new PizzaPoint(i, j));
                }
            }
        }

        len = pizza.size();
        combi = new int[m];

        t.DFS(0, 0);

        System.out.println(answer);
    }
}
