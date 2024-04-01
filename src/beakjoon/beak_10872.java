package beakjoon;

import java.io.*;

public class beak_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //상의 N개 하의 N개
        br.close();

        bw.write(factorial(N) + "\n");

        bw.flush();
        bw.close();
    }

    //팩토리얼 구하는 공식
    static int factorial(int N)
    {
        int result = 1; //0과 1 팩토리얼은 1이기 때문에 1부터 시작

        for(int i = 2; i <= N; i++)
        {
            result = result * i; //N만큼 곱한다. 숫자를 하나씩 증가시키면서
        }
        return result;
    }
}