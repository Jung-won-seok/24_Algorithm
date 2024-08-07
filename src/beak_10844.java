import java.util.Scanner;

public class beak_10844{
    static Long[][] dp;
    static int N;
    final static long MOD = 1000000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        dp = new Long[N + 1][10];

        //첫째 자릿수는 1로 초기화
        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1L;
        }

        long result = 0;
        for (int i = 1; i <= 9; i++) {
            result = result + recur(N, i);
        }
        System.out.println(result % MOD);
    }


    private static long recur(int digit, int val) { //digit=자릿수, val=다음 올 숫자
        //첫째 자리수에 도착한다면 더이상 탐색할 필요 없음
        if (digit == 1) {
            return dp[digit][val];
        }
        //해당 자리수의 val값에 대해 탐색하지 않았을 경우
        if (dp[digit][val] == null) {
            //val이 0일 경우 이전 자리는 1밖에 못옴
            if (val == 0) {
                dp[digit][val] = recur(digit - 1, 1);
            }
            //val이 9일경우 이전 자리는 8밖에 못옴
            else if (val == 9) {
                dp[digit][val] = recur(digit - 1, 8);
            } else {
                dp[digit][val] = recur(digit - 1, val - 1) + recur(digit - 1, val + 1);
            }
        }
        return dp[digit][val] % MOD;
    }
}
