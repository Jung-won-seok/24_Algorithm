import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class beak_1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int N = sc.nextInt();
        int K = sc.nextInt();

        for(int i=1 ; i<=N ; i++){
            queue.offer(i);
        }
        System.out.print("<");
        while(queue.size() != 1){
            for(int i=0 ; i< K-1 ; i++){
                queue.offer(queue.poll());
            }
            System.out.print(queue.poll() + ", ");
        }
        System.out.println(queue.poll() + ">");
    }
}
