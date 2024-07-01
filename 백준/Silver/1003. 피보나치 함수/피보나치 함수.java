import java.util.*;

public class Main {
    public static int[][] memo = new int[41][2];

    public static void main(String[] args) {
        fibonacciMemo();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            System.out.println(memo[x][0] + " " + memo[x][1]);
        }
    }

    public static void fibonacciMemo() {
        memo[0][0] = 1;
        memo[0][1] = 0;
        memo[1][0] = 0;
        memo[1][1] = 1;

        for (int i = 2; i < 41; i++) {
            memo[i][0] = memo[i - 1][0] + memo[i - 2][0];
            memo[i][1] = memo[i - 1][1] + memo[i - 2][1];
        }
    }
}
