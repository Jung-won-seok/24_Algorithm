import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class beak11656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = new String[input.length()]; // String타입의 input문자갯수를 크기로 갖는 배열 생성
        String temp = input;
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = temp;
            temp = input.substring(i+1);
        }
        Collections.sort(Arrays.asList(arr)); //Arrays.asList(arr) -> arr배열을 list로 변환 / Collections.sort() -> 리스트 요소들을 내림차순으로 정렬
        for(int j=0 ; j<arr.length ; j++){
            System.out.println(arr[j]);
        }
    }
}
