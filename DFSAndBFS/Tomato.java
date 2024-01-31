package DFSAndBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TomatoPoint {
    int x, y;

    public TomatoPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Tomato {

    static int n, m;
    static int board[][], dis[][];

    static int dx[]={0,0,-1,1}, dy[] = {1, -1, 0, 0};

    static Queue<TomatoPoint> q = new LinkedList<>();
    public void BFS() {
        while (!q.isEmpty()) {
            TomatoPoint poll = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    q.offer(new TomatoPoint(nx, ny));
                    dis[nx][ny] = dis[poll.x][poll.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Tomato t = new Tomato();
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();

        board = new int[n][m];
        dis = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] == 1) {
                    q.offer(new TomatoPoint(i, j));
                }
            }
        }
        t.BFS();

        boolean flag = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0) {
                    flag = false;
                }
            }
        }
        int answer = Integer.MIN_VALUE;
        if (flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }

    }
}
