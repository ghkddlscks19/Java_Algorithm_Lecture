package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Problem implements Comparable<Problem>{
    int score;
    int time;

    public Problem(int score, int time) {
        this.score = score;
        this.time = time;
    }

    @Override
    public int compareTo(Problem o) {
        return this.time - o.time;
    }
}
public class MaxScore {

    public int solution(int n, int m, ArrayList<Problem> arrayList) {
        int answer = 0;

        int dy[] = new int[m + 1];

        for (int i = 0; i < n; i++) {
            for (int j = m; j >= arrayList.get(i).time; j--) {
                dy[j] = Math.max(dy[j], dy[j - arrayList.get(i).time] + arrayList.get(i).score);
            }
        }

        for (int i : dy) {
            answer = Math.max(answer, i);
        }
        return answer;
    }

    public static void main(String[] args) {
        MaxScore T = new MaxScore();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Problem> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            arrayList.add(new Problem(s, t));
        }

        Collections.sort(arrayList);

        System.out.println(T.solution(n, m, arrayList));
    }
}
