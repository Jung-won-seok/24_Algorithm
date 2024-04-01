package practice;

import java.util.Scanner;

public class beak_1943_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for(int i=0 ; i<T ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int d = gcd(a ,b);
            System.out.println(a * b / d);
        }
    }

    private static int gcd(int a, int b) {
        if(b==0)
            return a;
        else
            return gcd(b, a%b);
    }
}
