import java.util.Scanner;

public class Main {

    public int solution(int arr[][], int N, int M) {
        int answer = 0;

        for (int i = 1; i <= N; i++) {
            int count = 0;
            for (int j = 1; j <= M; j++) {
                for (int k = 0; k < M; k++) {

                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 학생 수
        int M = sc.nextInt(); // 수학 테스트 등수

        int arr[][] = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(m.solution(arr, N, M));
    }
}
