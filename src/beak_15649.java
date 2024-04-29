import java.util.Scanner;

public class beak_15649 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N = 4
        int M = sc.nextInt(); // M = 2 -> 개 중에서 2개 중복없이 뽑는 경우

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
    }
}
