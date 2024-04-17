import java.util.Scanner;

public class beak_6064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            boolean check = false;

            for (int j = x; j < N * M; j = j + M) {
                if (j % N == y) {
                    System.out.println(j + 1);
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println(-1);
            }
        }
    }
}
