import java.util.Scanner;

public class beak_9095 {
    static int dp[] = new int[11]; //다이나믹 프로그래밍
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i <= 10; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        System.out.println();
        for (int j = 0; j < T; j++) {
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
    }

}
