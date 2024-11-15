import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a <= 0) {
			System.out.println("input a is out of range.\n(a should be bigger than 0, but now a is " + a + ".");
			return;
		}
		int b = sc.nextInt();
		if (b >=10) {
			System.out.println("input b is out of range.\n(a should be smaller than 10, but now b is " + b + ".");
			return;
		}
		System.out.println(a + b);
	}
}