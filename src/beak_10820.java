import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class beak_10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while ((s = br.readLine()) != null && !s.isEmpty()) {
            int small = 0;
            int capital = 0;
            int number = 0;
            int space = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == ' ') space++;
                if (Character.isUpperCase(c)) capital++;
                if (Character.isLowerCase(c)) small++;
                if (Character.isDigit(c)) number++;
            }
            bw.write(small + " " + capital + " " + number + " " + space + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
