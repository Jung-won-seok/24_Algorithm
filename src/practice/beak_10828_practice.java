package practice;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class beak_10828_practice {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int N = sc.nextInt();
        sc.nextLine();
        for(int i=0 ; i<N ; i++){
            String input = sc.nextLine();
            String[] arr = input.split("\\s+");
            switch (arr[0]){
                case "push":
                    stack.push(Integer.valueOf(arr[1]));
                    break;
                case "pop":
                    if(stack.isEmpty()){
                        System.out.println("-1");
                    }else{
                        System.out.println(stack.pop());
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if(stack.isEmpty()) {
                        System.out.println(1);
                    } else{
                        System.out.println(0);
                    }
                    break;
                case "top":
                    if(!stack.isEmpty()) {
                        System.out.println(stack.peek());
                    }else{
                        System.out.println(-1);
                    }
                    break;
            }
        }
    }
}
