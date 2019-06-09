import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        Integer[] b = new Integer[n];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < n; j++){
                if(i == 0){
                    a[j] = sc.nextInt();
                }
                if(i == 1){
                    b[j] = sc.nextInt();
                }
            }
        }
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        int sum = 0;
        for(int k = 0; k < n; k++){
            sum += a[k] * b[k];
        }
        System.out.println(sum);
    }
}
