import java.util.Arrays;
import java.util.Scanner;

public class beak_15655 {
    static public int N, M;
    static public int[] arr;
    static public int[] array;
    static public boolean[] visit;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // N=4
        M = sc.nextInt(); // M=2
        array = new int[N]; // array[] = [ 9 8 7 1 ]
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        arr = new int[M];
        visit = new boolean[N];
        dfs(0,0);
    }

    static public void dfs(int depth, int start) {
        if (depth == M) {
            for (int a : arr) {
                System.out.print(a+" ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = array[i];
                dfs(depth + 1, i);
                visit[i] = false;
            }
        }
    }
}
