package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Top implements Comparable<Top>{
    int area;
    int height;
    int weight;

    public Top(int area, int height, int weight) {
        this.area = area;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Top o) {
        return o.area - this.area;
    }
}

public class HighestTop {

    public int solution(int n, ArrayList<Top> arrayList) {
        int answer = 0;
        int dp[] = new int[n];
        dp[0] = arrayList.get(0).height;

        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arrayList.get(j).weight > arrayList.get(i).weight && dp[j] > max) {
                    max = dp[j];
                }
            }
            dp[i] = max + arrayList.get(i).height;
            answer = Math.max(dp[i], answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        HighestTop t = new HighestTop();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Top> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int h = sc.nextInt();
            int w = sc.nextInt();
            arrayList.add(new Top(a, h, w));
        }

        Collections.sort(arrayList);

        System.out.println(t.solution(n, arrayList));
    }
}
