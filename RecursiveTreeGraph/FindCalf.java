package RecursiveTreeGraph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindCalf {
    static int s, e;
    static int[] ch = new int[10001];

    static int[] dist = {1, -1, 5};
    public int BFS(int s) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        ch[s] = 1;
        int l = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int p = q.poll();
                for (int j= 0; j < dist.length; j++) {
                    int next = p + dist[j];
                    if(next == e) return l+1;
                    if (next >= 1 && next <= 10000 && ch[next] == 0) {
                        ch[next] = 1;
                        q.offer(next);
                    }
                }
            }
            l++;
        }
        return 0;
    }

    public static void main(String[] args) {
        FindCalf t = new FindCalf();
        Scanner sc = new Scanner(System.in);

        s = sc.nextInt();
        e = sc.nextInt();

        System.out.println(t.BFS(s));
    }
}
