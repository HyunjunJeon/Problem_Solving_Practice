import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem10870 {
    private static int[] memo;
    private static int fibonacci(int n) {
        if (n <= 1) {
            return memo[n];
        } else {
            if(memo[n] > 0) {
                return memo[n];
            }
        }
        return memo[n] = fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            memo = new int[21];
            memo[0] = 0; memo[1] = 1;
            fibonacci(n);
            System.out.println(memo[n]);
        }
    }
}
