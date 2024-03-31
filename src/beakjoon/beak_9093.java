package beakjoon;

import java.util.Scanner;

public class beak_9093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문장 개수를 입력하세요:");
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            System.out.println("문장을 입력하세요:");
            String change_before = sc.nextLine();

            String[] words = change_before.split("\\s+");
            for (String word : words) {
                System.out.print(reverseString(word) + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray(); //문자열 str을 charArray배열에 문자 단위로 대입

        int left = 0;
        int right = charArray.length - 1; //문자열을 이루는 갯수 -1
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }
        return new String(charArray);
    }
}
