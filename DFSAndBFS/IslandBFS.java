package DFSAndBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class IslandPoint {
    int x, y;

    public IslandPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class IslandBFS {

    static int n, answer = 0;
    static int board[][];

    static Queue<IslandPoint> q = new LinkedList<>();

    static int dx[] = {-1, 1, 0, 0, -1, -1, 1, 1}, dy[] = {0, 0, -1, 1, -1, 1, -1, 1};

    public void BFS(int x, int y, int[][] board) {
        q.offer(new IslandPoint(x, y));

        while (!q.isEmpty()) {
            IslandPoint poll = q.poll();
            for (int i = 0; i < dx.length; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    q.offer(new IslandPoint(nx, ny));
                }
            }
        }

    }

    public void solution(int[][] board) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    BFS(i, j, board);
                }
            }
        }
    }

    public static void main(String[] args) {
        IslandBFS t = new IslandBFS();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        t.solution( board);

        System.out.println(answer);

    }
}
