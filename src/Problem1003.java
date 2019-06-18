import java.util.Scanner;

public class Problem1003 {
    private static int[] memo;
    private static int fibonacci(int n) {
        if ( n <= 1) {
            return memo[n];
        } else {
            if(memo[n] > 0) {
                return memo[n];
            }
        }
        return memo[n] = fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            memo = new int[n+1];
            if(n > 1){
                memo[0] = 1; memo[1] = 1;
            }
            if(n == 0){
                System.out.println(1 + " " + 0);
            }else if(n == 1){
                System.out.println(0 + " " + 1);
            }else{
                fibonacci(n);
                System.out.println(memo[n-2] + " " + memo[n-1]);
            }
        }
    }
}
