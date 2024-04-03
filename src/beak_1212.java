import java.io.*;
import java.math.BigInteger;

public class beak_1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine(); // 8진수 -> 2진수

        BigInteger N = new BigInteger(S, 8);
        String result = N.toString(2);
        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
