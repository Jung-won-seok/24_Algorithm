import java.io.*;
import java.util.*;

public class beak_10972 {
    public static int n;
    public static int[] nums;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if(nextPermutation()) {
            for(int i=0; i<n; i++) System.out.print(nums[i] + " ");
        } else {
            System.out.println(-1);
        }
    }
    public static boolean nextPermutation() {
        //가장 마지막 순열인 경우 제외하기
        int i = nums.length - 1;
        while(i>0 && nums[i-1] >= nums[i]) {
            i--;
        }
        // i는 오른쪽에서부터 오름차순으로 가장높은 수인 경우
        if(i<=0) return false;

        int j = nums.length-1;
        //i = 오름차순에서 꺾이고 난 후 값
        //j = 오름차순에서 꺾이는 값보다 최소로 큰 값
        while (nums[j] <= nums[i-1]) {
            j--;
        }
        swap(i-1, j);

        //바꾼위치 뒤는 내림차순으로 변경
        j = nums.length-1;
        while(i < j) {
            swap(i, j);
            i++;
            j--;
        }
        return true;
    }

    public static void swap(int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
}