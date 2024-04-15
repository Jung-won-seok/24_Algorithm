import java.io.*;
import java.util.Scanner;
public class beak_1107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] error = new int[M];
        for (int i =0; i < M; i++) {
            error[i]= sc.nextInt();
        }

        for (int a : error) {
            System.out.println(a);
        }
    }

}
