import java.util.*;

public class Main {
    public static int[][] memo = new int[41][2];

    public static void main(String[] args) {
        // 미리 피보나치 수열에서 0과 1이 호출되는 횟수를 계산
        fibonacciMemo();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            System.out.println(memo[x][0] + " " + memo[x][1]);
        }
    }

    public static void fibonacciMemo() {
        memo[0][0] = 1; // fibonacci(0)에서 0의 호출 횟수
        memo[0][1] = 0; // fibonacci(0)에서 1의 호출 횟수
        memo[1][0] = 0; // fibonacci(1)에서 0의 호출 횟수
        memo[1][1] = 1; // fibonacci(1)에서 1의 호출 횟수

        for (int i = 2; i < 41; i++) {
            memo[i][0] = memo[i - 1][0] + memo[i - 2][0];
            memo[i][1] = memo[i - 1][1] + memo[i - 2][1];
        }
    }
}
