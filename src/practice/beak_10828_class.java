import java.util.Scanner;
import java.util.Stack;

public class beak_10828_class {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String input = sc.nextLine();
            String[] commands = input.split("\\s+");

            switch (commands[0]) {
                case "push":
                    push(stack, Integer.parseInt(commands[1]));
                    break;
                case "pop":
                    System.out.println(pop(stack));
                    break;
                case "size":
                    System.out.println(size(stack));
                    break;
                case "empty":
                    System.out.println(empty(stack));
                    break;
                case "top":
                    System.out.println(top(stack));
                    break;
            }
        }

        sc.close();
    }

    public static void push(Stack<Integer> stack, int number) {
        stack.push(number);
    }

    public static int pop(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            return -1;
        }
    }

    public static int size(Stack<Integer> stack) {
        return stack.size();
    }

    public static int empty(Stack<Integer> stack) {
        return stack.isEmpty() ? 1 : 0;
    }

    public static int top(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            return -1;
        }
    }
}
