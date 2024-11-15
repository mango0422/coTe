import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/9498
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score >= 90 && score <= 100) {
			System.out.println("A\n");
		} else if(score >= 80 && score <= 89) {
			System.out.println("B\n");
		} else if(score >= 70 && score <= 79) {
			System.out.println("C\n");
		} else if(score >= 60 && score <= 69) {
			System.out.println("D\n");
		} else if(score > 100 || score < 0){
			System.out.println("Error! Out Of Range!!\n");
		} else {
			System.out.println("F\n");
		}
	}
}
