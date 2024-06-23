import java.util.Scanner;

public class beak_15650 {
    public static int[] arr;
    public static int N, M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); //N=4
        M = sc.nextInt(); // M=2

        arr = new int[M]; //0, 1
        dfs(1, 0);
    }

    private static void dfs(int at, int depth) {
        if (depth == M) {
            for (int a : arr) {
                System.out.print(a + " ");
            }
            System.out.println();
            return;
        }
        for (int i = at; i <= N; i++) {
            arr[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }
}
