package BeakJun_Algorithm;
import java.util.Scanner;
public class beak_9093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문장 개수를 입력하세요:");
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i<T; i++) {
            System.out.println("문장을 입력하세요:");
            String sentence = sc.nextLine();
            String[] words = sentence.split("\\s+");
            for (String word : words) {
                System.out.print(reverseString(word) + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
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
