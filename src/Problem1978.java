import java.util.Arrays;
import java.util.Scanner;

public class Problem1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 1001;
        boolean[] arr = new boolean[max];
        Arrays.fill(arr, true);
        arr[1] = false;

        for(int i = 2; i < max; i++){
            for(int j = 2*i; j < max; j += i){
                if(!arr[j]) continue;
                arr[j] = false;
            }
        }

        int count = 0;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(arr[a]) count++;
        }
        System.out.println(count);
    }
}
