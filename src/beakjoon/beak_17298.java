package beakjoon;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class beak_17298 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++) {
            A[i] =sc.nextInt();
        }
        for(int i=0 ; i<N ; i++){
            int j = i + 1;
            int cnt = i + 1;
            while(j < N){
                if(A[i] < A[j]){
                    System.out.println(A[j]);
                    break;
                }
                else if(A[i] > A[j]){
                    cnt++;
                    j++;
                }
                if(cnt == N){
                    System.out.println(-1);
                }
            }
            if(i == N-1){
                System.out.print(-1);
            }
        }
    }
}