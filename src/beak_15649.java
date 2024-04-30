import java.util.Scanner;

public class beak_15649 {

    public static int[] arr; //
    public static boolean[] visit; //방문여부 표시

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N = 4
        int M = sc.nextInt(); // M = 2 -> 개 중에서 2개 중복없이 뽑는 경우

        arr = new int[M];
        visit = new boolean[N];
        dfs(N, M, 0);
    }

    private static void dfs(int N, int M, int depth) {
        if (depth == M) { //끝나는 시점
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);
                visit[i] = false;
            }
        }
    }
}
