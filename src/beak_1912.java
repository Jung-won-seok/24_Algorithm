import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beak_1912 {
    static int[] arr;
    static Integer[] dp;
    static int max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        dp = new Integer[N];
        StringTokenizer st = new StringTokenizer(br.readLine() + "");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = arr[0];
        max = arr[0];
        recur(N - 1);
        System.out.println(max);
    }

    private static int recur(int N) {
        if (dp[N] == null) {
            dp[N] = Math.max(recur(N - 1) + arr[N], arr[N]);
            max = Math.max(dp[N], max);
        }
        return dp[N];
    }
}
