import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = "Programming";
        String str2 = "Programming";
        String str3 = new String("Programming");

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
    }
}
