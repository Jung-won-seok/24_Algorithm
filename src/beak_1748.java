import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class beak_1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int plus = 1;
        int num = 10;
        for (int i = 1; i <= N; i++) {
            if (i % num == 0) {
                plus++;
                num = num * 10;
            }
            cnt = cnt + plus;
        }
        System.out.println(cnt);
        br.close();
    }
}
