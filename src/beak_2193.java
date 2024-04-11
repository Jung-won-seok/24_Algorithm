import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class beak_2193{
    public static long d[];
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        d = new long[N+1];
        System.out.println(Calculate(N));
    }

    public static long Calculate(int count){
        if(count == 0){
            return 0;
        }
        if(count == 1){
            return 1;
        }
        if(d[count] > 0){
            return d[count];
        }
        d[count] = Calculate(count-1) + Calculate(count-2);
        return d[count];
    }
}