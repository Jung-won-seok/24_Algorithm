import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 17103번 골드바흐 파티션
public class beak_17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        // 에라토스테네스의 체 : 소수 구하기 = 소수 false
        boolean[] num = new boolean[1000001];
        num[0] = num[1] = true;
        for (int i = 2; i * i <= 1000000; i++) {
            if (!num[i]) {
                for (int j = i + i; j <= 1000000; j += i) {
                    num[j] = true;
                }
            }
        }

        while (t-- > 0) {
            int temp = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int j = 2; j <= temp / 2; j++) {
                if (!num[j] && !num[temp - j]) ans++; //입력받은 수 에서 소수를 뺐을 때 결과가 소수이면 골드바흐 파티션
            }
            System.out.println(ans);
        }
    }

}