import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beak_17087 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        int[] numArray = new int[n];
        for (int i = 0; st.hasMoreTokens(); i++) {
            numArray[i] = Math.abs(Integer.parseInt(st.nextToken()) - s);
        }
        int d = numArray[0];
        for (int i = 0; i < n; i++) {
            d = gcd(d, numArray[i]);
        }

        System.out.println(d);
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

}