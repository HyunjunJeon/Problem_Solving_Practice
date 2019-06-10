import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for(int j = 0; j < arr.length; j++){
            System.out.println(arr[j]);
        }

    }
}
