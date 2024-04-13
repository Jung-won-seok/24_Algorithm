import java.util.Arrays;
import java.util.Scanner;

public class beak_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] small = new int[9];
        for (int i = 0; i < 9; i++) {
            small[i] = sc.nextInt();
        }

        int sum = 0; // 전체 합계를 초기화
        for (int k = 0; k < 9; k++) {
            sum += small[k]; // 전체 합계 계산
        }

        outerLoop: // 반복문 레이블 지정
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                int minus = small[i] + small[j];
                if (sum - minus == 100) {
                    small[i] = 0;
                    small[j] = 0;
                    break outerLoop; // 레이블을 사용하여 모든 반복문 종료
                }
            }
        }

        Arrays.sort(small);

        for (int i = 0; i < 9; i++) {
            if (small[i] != 0) {
                System.out.println(small[i]);
            }
        }
    }
}
