import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        // 원형 연결 리스트 생성
        Node head = new Node(1);
        Node current = head;
        for (int i = 2; i <= n; i++) {
            current.next = new Node(i); // 다음 노드 연결
            current = current.next;
        }
        current.next = head; // 마지막 노드를 첫 번째 노드에 연결

        // 결과 저장을 위한 StringBuilder
        StringBuilder result = new StringBuilder();
        result.append("<");

        int count = 0;
        Node prev = current; // 마지막 노드부터 시작
        while (n > 0) {
            count++;
            if (count == k) {
                // K번째 사람을 제거
                result.append(head.value);
                if (n > 1) {
                    result.append(", "); // 마지막 값이 아니면 쉼표 추가
                }
                prev.next = head.next; // 현재 노드를 리스트에서 제거
                head = head.next; // 다음 노드로 이동
                count = 0;
                n--;
            } else {
                prev = head;
                head = head.next;
            }
        }

        result.append(">");
        System.out.println(result); // 결과 출력
    }
	
	static class Node {
	    int value;
	    Node next;

	    public Node(int value) {
	        this.value = value;
	        this.next = null;
	    }
	}

}
