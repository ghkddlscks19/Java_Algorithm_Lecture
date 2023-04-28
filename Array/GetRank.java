package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class GetRank {

    public ArrayList<Integer> solution(int arr[], int N) {
        ArrayList<Integer> answer = new ArrayList<>();

        // 역순 정렬 할때는 Arrays.stream().boxed().toArray()로 primitive 형식으로 변환해줘야 함.
        Integer cpyarr[] = Arrays.stream(Arrays.copyOf(arr, N)).boxed().toArray(Integer[] ::new); // 복사할 배열 역순 정렬
        Arrays.sort(cpyarr, Collections.reverseOrder()); // 복사한 배열 정렬

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i] == cpyarr[j]) {
                    answer.add(j + 1);
                    break;
                }
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        GetRank m = new GetRank();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 학생 수

        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // 국어 점수
        }

        for (int x : m.solution(arr, N)) {
            System.out.print(x + " ");

        }
    }
}
