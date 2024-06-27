import java.util.Scanner;

public class beak_15651_2 {
    static public int[] arr;
    static public int N, M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); //N=4
        M = sc.nextInt(); //M=2
        //중복허용하며 1~N 에서 M 개 뽑는 경우의 수
        arr = new int[M];
        dfs(0);
    }

    public static void dfs(int depth) {
        if (depth == M) {
            for (int a : arr) {
                System.out.println(a);
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            arr[depth] = i;
            dfs(depth + 1);
        }
    }
}
