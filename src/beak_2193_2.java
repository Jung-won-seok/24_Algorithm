import java.util.Scanner;

public class beak_2193_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long d[] = new long[N+1];

        d[0] = 0;
        d[1] = 1;
        for (int i = 2; i <= N; i++) {
            d[i] = d[i - 1] + d[i - 2];
        }
        System.out.println(d[N]);
    }
}
