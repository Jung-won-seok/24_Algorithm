package beakjoon;

import java.util.Scanner;
public class beak_10824 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" "); //공백을 기준으로 배열에 문자열 저장
        String str1 = arr[0]+arr[1];
        String str2 = arr[2]+arr[3];
        System.out.println(Long.parseLong(str1)+Long.parseLong(str2)); //문자열을 long으로 형변환 후 계산
    }
}
