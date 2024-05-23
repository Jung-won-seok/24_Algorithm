import java.util.Scanner;

public class beak_15650 {
    static int N, M;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //1부터 N까지 수 중 중복없이 M개를 고른 수열(오름차순)
        N = sc.nextInt(); // N=4
        M = sc.nextInt(); // M=2
        arr = new int[M];
        dfs(1, 0);
    }

    private static void dfs(int at, int depth) {
        if (depth == M) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }
        for (int i = at; i <= N; i++) { //1 ~ 4
            arr[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }
}