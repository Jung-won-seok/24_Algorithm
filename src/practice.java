import java.util.Scanner;

public class practice {
    public static int[] arr;
    public static boolean[] visit;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N=4
        int M = sc.nextInt(); // M=2

        arr = new int[M];
        visit = new boolean[N];
        dfs(N, M, 0);
    }

    private static void dfs(int N, int M, int depth) {
        if (depth == M) {
            for (int a : arr) {
                System.out.println(a + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visit[i]) { // i를 방문하지 않았다면
                visit[i] = true; // 방문했다고 표시하기
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);
                visit[i] = false;
            }
        }
    }
}


