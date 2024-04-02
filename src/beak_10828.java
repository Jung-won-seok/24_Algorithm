import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class beak_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("pop")) {
                if (!stack.isEmpty()) {
                    bw.write(stack.pop() + "\n");
                } else {
                    bw.write("-1\n");
                }
            } else if (command.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            } else if (command.equals("size")) {
                bw.write(stack.size() + "\n");
            } else if (command.equals("empty")) {
                if (!stack.isEmpty()) {
                    bw.write("0\n");
                } else {
                    bw.write("1\n");
                }
            } else if (command.equals("top")) {
                if (!stack.isEmpty()) {
                    bw.write(stack.peek() + "\n");
                } else {
                    bw.write("-1\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static class beak_9093 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("문장 개수를 입력하세요:");
            int T = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i<T; i++) {
                System.out.println("문장을 입력하세요:");
                String sentence = sc.nextLine();
                String[] words = sentence.split("\\s+");
                for (String word : words) {
                    System.out.print(reverseString(word) + " ");
                }
                System.out.println();
            }
            sc.close();
        }

        public static String reverseString(String str) {
            char[] charArray = str.toCharArray();
            int left = 0;
            int right = charArray.length - 1;
            while (left < right) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
            return new String(charArray);
        }
    }
}
