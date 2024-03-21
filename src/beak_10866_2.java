import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class beak_10866_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        int x;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            String command = st.nextToken();

            switch (command) {
                case "push_front":
                    x = Integer.parseInt(st.nextToken());
                    deque.addFirst(x);
                    break;
                case "push_back":
                    x = Integer.parseInt(st.nextToken());
                    deque.addLast(x);
                    break;
                case "pop_front":
                    if (!deque.isEmpty())
                        bw.write(deque.removeFirst() + "\n");
                    else
                        bw.write("-1\n");
                    break;
                case "pop_back":
                    if (!deque.isEmpty())
                        bw.write(deque.removeLast() + "\n");
                    else
                        bw.write("-1\n");
                    break;
                case "size":
                    bw.write(deque.size() + "\n");
                    break;
                case "empty":
                    if (deque.isEmpty())
                        bw.write("1\n");
                    else
                        bw.write("0\n");
                    break;
                case "front":
                    if (!deque.isEmpty())
                        bw.write(deque.getFirst() + "\n");
                    else
                        bw.write("-1\n");
                    break;
                case "back":
                    if (!deque.isEmpty())
                        bw.write(deque.getLast() + "\n");
                    else
                        bw.write("-1\n");
                    break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
