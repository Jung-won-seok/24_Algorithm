import java.util.Scanner;

public class beak_15649_3 {
    static public int N, M;
    static public int[] arr;
    static public boolean[] visit;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];
        visit = new boolean[N];
        dfs(N, M, 0);
    }

    static public void dfs(int N, int M, int depth) {
        if (depth == M) {

        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i = 1;
                dfs(N, M, depth + 1);
                visit[i] = false;
            }
        }

    }
}
