import java.io.*;
import java.math.BigInteger;

public class beak_1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        BigInteger N = new BigInteger(S, 2); //문자열S를 2진수로 변환 후 문자열로 저장
        String result = N.toString(8); //N을 8진수 문자열로 변환
        bw.write(result+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
