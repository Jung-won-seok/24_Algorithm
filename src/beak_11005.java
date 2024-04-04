import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class beak_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //String N = br.readLine();
        int N = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        //BigInteger result = new BigInteger(N, 10);
        System.out.println(Integer.toString(N,B).toUpperCase());
    }
}
