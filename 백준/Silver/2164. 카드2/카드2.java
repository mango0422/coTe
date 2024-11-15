import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue queue = new LinkedList();
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			queue.add(i);
		}
		
		for(int j=0; j<n-1; j++) {
			queue.poll();
			queue.add(queue.poll());
		}
		System.out.println(queue.peek());
	}

}
