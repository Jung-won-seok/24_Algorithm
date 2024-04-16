import javax.management.StringValueExp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class beak_1107 {
    static boolean[] broken;
    static int target;
    static long count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        target = Integer.parseInt(br.readLine()); //도달하려는 숫자
        int n = Integer.parseInt(br.readLine()); //고장난 버튼 갯수
        broken = new boolean[10]; //고장는지?
        if (n > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int cur = Integer.parseInt(st.nextToken());
                broken[cur] = true; //고장났으면 true, 멀쩡하면 false
            }
        }
        if (target == 100) {
            System.out.println(0);
            return;
        }
        count = Math.abs(target - 100); //+, - 로만 움직이는것이 빠른 경우
        dfs(0, 0);
        System.out.println(count);
    }

    public static void dfs(int idx, int click) {
        for (int i = 0; i < 10; i++) {
            if (!broken[i]) { //고장나지 않은 버튼일 때
                int newBtn = click * 10 + i;
                int cnt = Math.abs(target - newBtn) + String.valueOf(newBtn).length();
                count = Math.min(count, cnt);

                if (idx < 6) {
                    dfs(idx + 1, newBtn);
                }
            }
        }
    }
}
