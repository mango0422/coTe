import java.util.Scanner;

public class fiboDp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스의 수
        int[] dpZero = new int[41];
        int[] dpOne = new int[41];

        // 초기값 설정
        dpZero[0] = 1;
        dpOne[0] = 0;
        dpZero[1] = 0;
        dpOne[1] = 1;

        // DP 배열 채우기
        for (int i = 2; i <= 40; i++) {
            dpZero[i] = dpZero[i - 1] + dpZero[i - 2];
            dpOne[i] = dpOne[i - 1] + dpOne[i - 2];
        }

        // 테스트 케이스 처리
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(dpZero[n] + " " + dpOne[n]);
        }

        sc.close();
    }
}