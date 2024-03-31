package beakjoon;

import java.util.Scanner;
import java.util.Stack;

public class beak_10799 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        String str = sc.nextLine();
        int result = 0;
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i) == '(') {
                stack.push((int) '(');
            }else if(str.charAt(i) == ')'){
                stack.pop();
            }
            if(i>0){
                if(str.charAt(i-1) == '(' && str.charAt(i) == ')'){
                    result += stack.size();
                }else if (str.charAt(i-1) == ')' && str.charAt(i) == ')'){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
