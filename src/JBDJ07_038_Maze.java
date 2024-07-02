import java.util.Scanner;

public class JBDJ07_038_Maze {
    static public int[][] maze;
    static public boolean[][] visit;
    static public int cnt=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        maze = new int[10][10];
        visit = new boolean[10][10];

        maze = new int[][] {
                {0, 1, 1, 0, 0, 0, 0, 1, 0, 1},
                {0, 0, 1, 0, 0, 1, 0, 0, 1, 0},
                {1, 0, 1, 1, 0, 1, 0, 1, 0, 0},
                {1, 0, 0, 0, 0, 1, 0, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 0, 1, 0, 0},
                {1, 0, 1, 1, 0, 0, 0, 1, 0, 1},
                {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
                {1, 0, 0, 1, 0, 1, 0, 0, 1, 1},
                {1, 0, 1, 1, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 0, 1, 1, 1, 0, 0, 0}
        };

        dfs(0, 0);
        if (visit[9][9] == false) {
            System.out.print("Fail, ");
            System.out.println(cnt);
        } else if (visit[9][9] == true) {
            System.out.println("Pass, ");
            System.out.println(cnt);
        }
    }

    public static void dfs(int a, int b) {
        if (a >= 10 || b >= 10 || a < 0 || b < 0) {
            return;
        }
        if (visit[a][b] || maze[a][b] != 0) {
            return;
        }
        visit[a][b] = true;
        cnt++;
        if (a<9 && maze[a + 1][b] == 0) {
            dfs(a + 1, b);
        }
        if (a>0 && maze[a - 1][b] == 0) {
            dfs(a - 1, b);
        }
        if (b<9 && maze[a][b + 1] == 0) {
            dfs(a, b + 1);
        }
        if (b>0 && maze[a][b - 1] == 0) {
            dfs(a, b-1);
        }
    }
}
// 0 1 1 0 0 1 0 1 0 1
// 0 0 0 1 1 1 0 0 1 0
// 1 0 0 0 1 1 0 0 0 0
// 1 1 1 0 1 1 1 1 0 1
// 1 1 1 0 0 1 1 1 0 0
// 1 0 1 1 0 1 0 1 0 1
// 1 1 1 1 0 0 0 1 1 0
// 1 0 0 0 1 1 0 0 1 1
// 1 0 1 0 1 0 1 0 0 1
// 1 0 1 0 1 0 1 0 0 0

