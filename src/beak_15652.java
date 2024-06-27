import java.util.Scanner;

public class beak_15652 {
    static public int[] arr;
    static public int N, M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // N=4
        M = sc.nextInt(); // M=2
        //1~N 까지의 수 중에서 M 개를 고른 수열
        arr = new int[M];
        dfs(1, 0);
    }

    public static void dfs(int th, int depth) {
        if (depth == M) {
            for (int a : arr) {
                System.out.print(a + " ");
            }
            System.out.println();
            return;
        }
        for (int i = th; i <= N; i++) {
            arr[depth] = i;
            dfs(i, depth + 1);

        }
    }
}
