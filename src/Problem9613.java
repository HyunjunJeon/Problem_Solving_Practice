import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Problem9613 {
    public static int GCD(int a, int b){
        if(a < b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        int result = a % b;
        if(result == 0){
            return b;
        }
        return GCD(b, result);
    }
    public static void main(String[] args) throws Exception{
        try(Scanner sc = new Scanner(System.in);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            int t = sc.nextInt();
            int[] arr;

            for(int i = 0; i < t; i++){
                int n = sc.nextInt();
                arr = new int[n];
                for(int j = 0; j < n; j++){
                    arr[j] = sc.nextInt();
                }
                long sum = 0;
                for(int k = 0; k < n; k++){
                    for(int l = k+1; l < n; l++){
                        sum += GCD(arr[k], arr[l]);
                    }
                }
                bw.write(sum + "\n");
            }
            bw.flush();
        }
    }
}
