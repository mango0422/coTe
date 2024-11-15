import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	// https://www.acmicpc.net/problem/10828
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        MyStack stack = new MyStack(n);

        for (int i = 0; i < n; i++) {
            String command = sc.next();

            switch (command) {
                case "push":
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case "pop":
                    System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.isEmpty());
                    break;
                case "top":
                    System.out.println(stack.peek());
                    break;
            }
        }

        sc.close();
    }

    static class MyStack {
        private int[] stack;
        private int top;
        private int capacity;

        public MyStack(int size) {
            stack = new int[size];
            top = -1;
            capacity = size;
        }

        public void push(int value) {
            if (isFull()) {
                System.out.println("스택이 가득 찼습니다!");
                return;
            }
            stack[++top] = value;
        }

        public int pop() {
            if (isEmpty() == 1) {
                return -1; // 스택이 비어 있을 때 -1 반환
            }
            return stack[top--];
        }

        public int peek() {
            if (isEmpty() == 1) {
                return -1; // 스택이 비어 있을 때 -1 반환
            }
            return stack[top];
        }

        public int isEmpty() {
            return top == -1 ? 1 : 0; // 비어 있으면 1, 아니면 0 반환
        }

        public int size() {
            return top + 1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }
    }
}
