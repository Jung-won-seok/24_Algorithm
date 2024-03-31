package beakjoon;

import java.util.Scanner;
import java.util.Stack;

public class beak_17413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<Character>();
        int check = 0; // 태그안인지 아닌지 체크.
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for(char ch : input.toCharArray()) {
            if(ch == '<') {
                check+=1;
                while(!stack.isEmpty()) {
                    result.append(stack.pop());
                }
                result.append("<");
            } else if(ch == '>') {
                check-=1; // 태그 탈출.
                result.append(">");
            } else if(ch == ' ') {
                // 공백 전까지의 문자 뒤집기.
                while(!stack.isEmpty())
                    result.append(stack.pop());
                result.append(" ");
            } else {
                if(check == 0)
                    stack.push(ch);
                else
                    result.append(ch);
            }
        }

        while(!stack.isEmpty())
            result.append(stack.pop());

        System.out.println(result);
    }
}
