package practice;

import java.util.Scanner;

public class beak_9093_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문장의 개수를 입력하시오: ");
        int T = sc.nextInt();
        sc.nextLine();

        for(int i=0 ; i<T ; i++){
            System.out.println("문장을 입력하세요: ");
            String input = sc.nextLine();
            String[] word = input.split("\\s+");
            for(int j=0 ; j< word.length ; j++){
                System.out.print(revers(word[j]) + " ");
            }
            System.out.println();
        }

    }

    public static String revers(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length -1;
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return new String(arr);
    }
}
