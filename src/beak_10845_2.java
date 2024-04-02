import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class beak_10845_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        int last = 0;
        int x;

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    x = Integer.parseInt(st.nextToken());
                    last = x;
                    queue.offer(x);
                    break;
                case "pop":
                    if(queue.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(queue.poll() + "\n");
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    if(queue.isEmpty())
                        bw.write("1\n");
                    else
                        bw.write("0\n");
                    break;
                case "front":
                    if(queue.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(queue.peek() + "\n");
                    break;
                case "back":
                    if(queue.isEmpty())
                        bw.write("-1\n");
                    else
                        bw.write(last + "\n");
                    break;
            }
        }

        br.close();
        bw.close();
    }
}
