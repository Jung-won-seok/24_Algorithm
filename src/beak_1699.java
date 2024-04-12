import java.awt.desktop.ScreenSleepEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class beak_1699 {
    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n + 1];

        dp[0] = 0;
        dp[1] = 1;
        System.out.println(recur(n));
    }

    private static int recur(int n){
        for (int i = 2; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= i / 2; j++) {
                if (j * j == i) {
                    min = 1;
                    break;
                }else{
                    min = Math.min(min, dp[i - j] + dp[j]);
                }
            }
            dp[i] = min;
        }
    }
}
