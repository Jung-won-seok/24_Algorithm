package beakjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class beak_6588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 2; i <= n; i++) {  // 2부터 시작
            if (isPrime(i)) {
                list.add(i);
            }
        }

        int sum = 0;
        int left = 0;
        int right = list.size() - 1;  // 수정된 부분

        while (left < right) {
            sum = list.get(left) + list.get(right);
            if (sum == n) {
                System.out.println(n + " = " + list.get(left) + " + " + list.get(right));  // 수정된 부분
                break;
            } else if (sum < n) {
                left++;
            } else {
                right--;
            }
        }

        sc.close();
    }

    private static boolean isPrime(int num) {
        if (num == 2)  // 2는 소수입니다.
            return true;
        if (num < 2 || num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
