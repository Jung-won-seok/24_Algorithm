import java.util.Scanner;

public class beak_3085 {
    static int n;
    static char[][] board;
    static int max = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        board = new char[n][n]; //문자열을 받아서 바로 n열에 저장

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < n; j++) {
                board[i][j] = s.charAt(j);
            }
        }

        //오른쪽과 위치 변경
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                swap(i, j, i, j + 1);
                search();
                swap(i, j + 1, i, j);
            }
        }

        //아래와 위치 변경
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                swap(i, j, i + 1, j);
                search();
                swap(i + 1, j, i, j);
            }
        }

        System.out.println(max);


    }

    //원소 위치 교환
    private static void swap(int x1, int y1, int x2, int y2) {
        char temp = board[x1][y1];
        board[x1][y1] = board[x2][y2];
        board[x2][y2] = temp;
    }

    private static void search() {

        // [행]에서 긴 수열 탐색
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n - 1; j++) {
                if (board[i][j] == board[i][j + 1]) {
                    cnt++;
                    max = Math.max(cnt, max); //cnt와 max중 더 큰 값을 max에 저장
                }else{
                    cnt = 1;
                }
            }
        }

        // [열]에서 긴 수열 탐색
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n - 1; j++) {
                if (board[j][i] == board[j + 1][i]) {
                    cnt++;
                    max = Math.max(cnt, max);
                } else {
                    cnt = 1;
                }
            }
        }
    }
}
