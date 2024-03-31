package beakjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class beak_10845_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int N = sc.nextInt();
        sc.nextLine();
        int last = 0;
        int x;
        for(int i=0 ; i<N ; i++){
            String str = sc.nextLine();
            String input[] = str.split(" ");
            switch (input[0]){
                case "push":
                    x = Integer.parseInt(input[1]);
                    last = x;
                    queue.offer(x);
                    break;
                case "pop":
                    if(queue.isEmpty())
                        System.out.println("-1");
                    else
                        System.out.println(queue.poll());
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    if(queue.isEmpty())
                        System.out.println("1");
                    else
                        System.out.println("0");
                    break;
                case "front":
                    if(queue.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(queue.peek());
                    break;
                case "back":
                    if(queue.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(last);
                    break;
            }
        }
    }
}
