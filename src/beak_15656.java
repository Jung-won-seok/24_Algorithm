import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class beak_15656 {
    static public int N, M;
    static public int[] array;
    static public int[] arr;
    static public StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //N=4
        M = Integer.parseInt(st.nextToken()); //M=2
        // N개중 M개를 고르는 경우의 수
        st = new StringTokenizer(br.readLine());
        array = new int[N];
        arr = new int[M];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        //array[] = [ 9 8 7 1 ] -> [ 1 7 8 9 ]
        Arrays.sort(array);
        dfs(N, M, 0);
        System.out.println(sb);
    }

    static public void dfs(int N, int M, int depth) {
        if (depth == M) {
            for (int a : arr) {
                sb.append(a).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = 0; i < N; i++) {
            arr[depth] = array[i];
            dfs(N, M, depth + 1);
        }
    }

}
