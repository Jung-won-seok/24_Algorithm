package beakjoon;

import java.util.Scanner;

public class beak_11655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] arr = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i<input.length() ; i++){
            if(!Character.isLetter(arr[i])){ //문자인지 아닌지 판별
                sb.append(arr[i]);
                continue;
            }
            int n = (int)arr[i] + 13;
            if(Character.isUpperCase(arr[i]) && n>90){ //대문자인가?
                n-=26;
            }
            if(Character.isLowerCase(arr[i]) && n>122){ //소문자인가?
                n-=26;
            }
            sb.append((char)n);
        }
        System.out.println(sb);
    }
}
