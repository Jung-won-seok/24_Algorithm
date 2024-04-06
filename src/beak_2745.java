import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class beak_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken(); //N은 B진법이다. 10진법으로 변환하라.
        int B = Integer.parseInt(st.nextToken());
        br.close();

        int temp = 1;
        int sum = 0;
        //ZZZZZ -> 60466175
        for (int i = N.length() - 1; i >= 0; i--) {
            char C = N.charAt(i);

            if ('A' <= C && 'Z' >= C) { // 10=A, 11=B,,,,
                sum += (C - 'A' + 10) * temp; // C가 F(15)라 하면 ->
            } else {
                sum += (C - '0') * temp;
            }
            temp *= B;
        }
        System.out.println(sum);
    }
}
