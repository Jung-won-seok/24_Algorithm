import java.util.Scanner;

public class beak_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        int a = 2;

        boolean[] num = new boolean[10000001];
        num[0] = num[1] = true;
        for (int i = 2; i * i <= 10000000; i++) {
            if (!num[i]) {
                for (int j = i + i; j <= 10000000; j += i) {
                    num[j] = true; //소수가 아니면 true, 소수이면 false
                }
            }
        }

        while(N>1){
            if (N % a == 0) {
                N = N / a;
                System.out.println(a);
            } else {
                a++;
            }
        }
    }
}
