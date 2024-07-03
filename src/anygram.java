import java.util.Arrays;

public class anygram {
    public static void bubbleSort(int[] array){
        //array[] = {1, 6, 4, 3};
        for(int i=array.length-1 ; i>0 ; i--){//3 2 1
            for(int j=0 ; j<i ; j++){ //i==3
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for(int a : array){
            System.out.print(a+" ");
        }
    }

    public static void is_anygram(String input, String expected){ //input = "apple", expected = "ppale"
        char[] input_array = input.toCharArray(); //input_array = {'a', 'p', 'p', 'l', 'e'}
        char[] expected_array = expected.toCharArray(); //expected_array = {'p', 'p', 'a', 'l', 'e'}
        boolean[] input_visit = new boolean[input_array.length];
        boolean[] expected_visit = new boolean[expected_array.length];

        for(int i=0 ; i<input_array.length ; i++){
            for(int j=0 ; j<expected_array.length ; j++){
                if((input_array[i] == expected_array[j]) && !input_visit[i] && !expected_visit[j]){
                    input_visit[i] = true;
                    expected_visit[j] = true;
                    break;
                }
            }
        }

        if(Arrays.equals(input_visit, expected_visit)){
            System.out.println("애니그램이 맞습니다.");
        } else {
            System.out.println("애니그램이 아닙니다.");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 6, 4, 3, 5, 10, 88};
        bubbleSort(array);
        System.out.println();
        is_anygram("apple", "ppale");
    }
}

//is anygram? -> anygram인지 판별하는 메서드 만들기
