import java.util.Scanner;

public class beak_10973 {
    public static int[] input;
    public static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        input = new int[N];
        for (int a : input) {
            a = sc.nextInt();
        }
        //가능한 조합 전부 다 만들어서 사전순으로 정렬하기
        //input[] = [ 5, 4, 3, 2, 1 ]
        dfs(0);
    }

    public static void dfs(int a) {
        for (int i = 0; i < N; i++) {

        }
    }

}
