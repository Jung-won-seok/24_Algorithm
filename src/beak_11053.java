import java.util.Scanner;

public class beak_11053 {
    static int[] seq;
    static Integer[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        seq = new int[N];
        dp = new Integer[N];

        for (int i = 0; i < N; i++) {
            seq[i] = sc.nextInt();
        }
        //0~N-1 까지 모든 부분수열 탐색
        for (int i = 0; i < N; i++) {
            LTS(i);
        }

        int max = dp[0];
        for (int i = 0; i < N; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }

    private static int LTS(int N) {
        //만약 탐색하지 않은 위치의 경우
        if (dp[N] == null) {
            dp[N] = 1;

            //N-1 부터 0까지중 N보다 작은 값들을 찾으면서 재귀호출
            for (int i = N - 1; i >= 0; i--) {
                if (seq[i] < seq[N]) {
                    dp[N] = Math.max(dp[N], LTS(i) + 1);
                }
            }
        }
        return dp[N];
    }
}
