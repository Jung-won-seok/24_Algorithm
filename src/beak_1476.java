import java.util.Scanner;

public class beak_1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();

        int e = 1, s = 1, m = 1;
        int ans = 1;
        while (true) {
            if (e > 15) {
                e = 1;
            }
            if (s > 28) {
                s = 1;
            }
            if (m > 19) {
                m = 1;
            }
            if (e == E && s == S && m == M) {
                break;
            }
            e++;
            s++;
            m++;
            ans++;
        }
        System.out.println(ans);
    }
}
