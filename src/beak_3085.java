import java.util.Scanner;

public class beak_3085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char[][] board = new char[n][n]; //문자열을 받아서 바로 n열에 저장
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            board[i] = input.toCharArray();
        }

        if(board[0][0])

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
