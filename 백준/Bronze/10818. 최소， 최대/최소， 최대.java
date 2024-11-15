import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		// https://www.acmicpc.net/problem/10818
		
		Scanner sc = new Scanner(System.in);
		int min = 0, max = 0, n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			int x = sc.nextInt();
			if(i == 0) {
				min = max = x;
			}else if(i!=0 && x > max) {
				max = x;
			} else if(i!=0 && x < min) {
				min = x;
			}
		}
		System.out.println(min + " " + max);
	}
}