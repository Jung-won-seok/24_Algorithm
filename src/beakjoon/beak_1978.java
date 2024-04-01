package beakjoon;

import java.io.*;
import java.util.StringTokenizer;

public class beak_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()+" ");
        int count = 0;
        for(int i=0 ; i<N ; i++){
            int input = Integer.parseInt(st.nextToken());

            if(isPrime(input)){
                count++;
            }
        }
        bw.write(count +"\n");
        bw.flush();
        bw.close();
        br.close();
    }


    private static boolean isPrime(int num) {
        if(num <= 1)
            return false;
        if(num == 2)
            return true;
        if(num % 2 == 0){
            return false;
        }
        for(int i=3 ; i<Math.sqrt(num) ; i+=2){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
