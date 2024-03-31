package beakjoon;

import java.util.Scanner;
import java.util.Stack;

public class beak_1406_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input_sentence = sc.nextLine();
        int M = sc.nextInt();
        sc.nextLine();

        Stack<String> LeftStack = new Stack<>();
        Stack<String> RightStack = new Stack<>();
        String[] arr = input_sentence.split("");
        for(String s : arr){ //arr 배열의 각 요소를 s라는 임시 변수에 순차적으로 대입
            LeftStack.push(s); //스택에 현재 순회 중인 s를 push
        }
        for(int i=0 ; i<M ; i++){
            String command = sc.nextLine();
            char c = command.charAt(0);
            switch (c){
                case 'L':
                    if(!LeftStack.isEmpty())
                        RightStack.push(LeftStack.pop());
                    break;
                case 'D':
                    if(!RightStack.isEmpty())
                        LeftStack.push(RightStack.pop());
                    break;
                case 'B':
                    if(!LeftStack.isEmpty())
                        LeftStack.pop();
                    break;
                case 'P':
                    char t = command.charAt(2);
                    LeftStack.push(String.valueOf(t));
                    break;
                default:
                    break;
                    }
            }
        while (!LeftStack.isEmpty())
            RightStack.push(LeftStack.pop());
        while(!RightStack.isEmpty())
            System.out.println(RightStack.pop());
        }
    }