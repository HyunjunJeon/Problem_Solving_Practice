import java.util.Scanner;

public class Problem2747 {
    public static int fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        int prev = 0; int next = 1; int tmp;
        for(int i = 2; i <= n; i++){
            tmp = prev+next;
            prev = next;
            next = tmp;
        }
        return next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(fibonacci(sc.nextInt()));
    }
}
