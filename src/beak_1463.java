import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class beak_1463 {
    public static int d[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        d = new int[number + 1];
        System.out.println(calculate(number));
    }

    private static int calculate(int number) {
        if (number == 1) {
            return 0;
        }
        if (d[number] > 0) {
            return d[number];
        }
        d[number] = calculate(number - 1) + 1;
        if (number % 3 == 0) {
            d[number] = Math.min(d[number], calculate(number / 3) + 1);
        }
        if (number % 2 == 0) {
            d[number] = Math.min(d[number], calculate(number / 2) + 1);
        }
        return d[number];
    }
}
