package beakjoon;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class beak_1943 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i=0 ; i<T ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int d = gcd(a ,b);
            bw.write((a*b/d) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static int gcd(int a, int b) {
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
}
