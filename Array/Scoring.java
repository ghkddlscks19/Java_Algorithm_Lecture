package Array;

import java.util.Scanner;

public class Scoring {
    public int solution(int arr[], int N) {
        int answer = 0;

        int count = 0; // 연속 정답 개수

        for (int i = 0; i < N; i++) {
            if(arr[i] == 1){
                count++;
                answer += count;
            }else{
                count = 0;
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        Scoring m = new Scoring();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 문제 수

        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // 맞추거나 틀린 문제들
        }

        System.out.println(m.solution(arr,  N));
    }
}
