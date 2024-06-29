import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class beak_15657 {
    static public int N, M;
    static public int[] array;
    static public int[] arr;
    static public boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        array = new int[N];
        arr = new int[M];
        visit = new boolean[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        //array[] = [ 9 8 7 1 ] -> [ 1 7 8 9 ]
        Arrays.sort(array);
        dfs(0, 0);
    }

    static public void dfs(int start, int depth) {
        if (depth == M) {
            for (int a : arr) {
                System.out.print(a+" ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i < N; i++) {
                arr[depth] = array[i];
                dfs(i, depth + 1);
        }

    }
}
