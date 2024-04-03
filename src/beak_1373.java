import java.io.*;
import java.math.BigInteger;

public class beak_1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        BigInteger N = new BigInteger(S, 2);
        String result = N.toString(8);
        bw.write(result+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
