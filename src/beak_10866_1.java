import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class beak_10866_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deque = new LinkedList<>();
        int N = sc.nextInt();
        sc.nextLine();
        int x;
        for(int i=0 ; i<N ; i++){
            String str = sc.nextLine();
            String input[] = str.split(" ");
            switch (input[0]){
                case "push_front":
                    x = Integer.parseInt(input[1]);
                    deque.addFirst(x);
                    break;
                case "push_back":
                    x = Integer.parseInt(input[1]);
                    deque.addLast(x);
                    break;
                case "pop_front":
                    if(!deque.isEmpty())
                        System.out.println(deque.removeFirst());
                    else
                        System.out.println("-1");
                    break;
                case "pop_back":
                    if(!deque.isEmpty())
                        System.out.println(deque.removeLast());
                    else
                        System.out.println("-1");
                    break;
                case "size":
                    System.out.println(deque.size());
                    break;
                case "empty":
                    if(deque.isEmpty())
                        System.out.println("1");
                    else
                        System.out.println("0");
                    break;
                case "front":
                    if(!deque.isEmpty())
                        System.out.println(deque.getFirst());
                    else
                        System.out.println("-1");
                    break;
                case "back":
                    if(!deque.isEmpty())
                        System.out.println(deque.getLast());
                    else
                        System.out.println("-1");
                    break;
            }
        }
    }
}
