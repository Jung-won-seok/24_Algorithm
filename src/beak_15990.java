import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class beak_15990 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int [n+1];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        long dp[][] = new long [100001][4];
        dp[1][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;

        for(int i=0; i<n; i++){
            for(int j=4; j<=arr[i]; j++){
                dp[j][1] = (dp[j-1][2] + dp[j-1][3]) % 1000000009;
                dp[j][2] = (dp[j-2][1] + dp[j-2][3]) % 1000000009;
                dp[j][3] = (dp[j-3][1] + dp[j-3][2]) % 1000000009;
            }
        }

        for(int i=0; i<n; i++){
            System.out.println((dp[arr[i]][1] + dp[arr[i]][2] + dp[arr[i]][3]) % 1000000009);
        }
    }
}