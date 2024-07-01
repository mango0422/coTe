import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt(), y1 = sc.nextInt(), r1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt(),
                    r2 = sc.nextInt();
            a[i] = calculate(x1, x2, y1, y2, r1, r2);
        }
        for (int j = 0; j < n; j++) {
            System.out.println(a[j]);
        }
    }

    public static int calculate(int x1, int x2, int y1, int y2, int r1, int r2) {
        double x3 = Math.pow(Math.abs(x1 - x2), 2);
        double y3 = Math.pow(Math.abs(y1 - y2), 2);
        double r3 = r1 + r2;
        double r4 = Math.abs(r1 - r2);

        double distance = Math.sqrt(x3 + y3);
        if (x1 == x2 && y1 == y2) {
            if (r1 == r2) {
                return -1;
            } else {
                return 0;
            }
        } else if (distance > r3 || distance < r4) {
            return 0;
        }
        if (distance == r3 || distance == r4) {
            return 1;
        }
        return 2;
    }
}