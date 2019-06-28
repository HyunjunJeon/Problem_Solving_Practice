import java.util.Scanner;

public class Problem2004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); long m = sc.nextLong();

        // 분모에 있는 것들은 지워지기 때문에 빼줘야 함...
        long res2 = 0; long res5 = 0;
        for(long i = 2; i <= n; i*=2){
            res2 += n/i;
        }

        for(long i = 2; i <= m; i*=2){
            res2 -= m/i;
        }

        for(long i = 2; i <= n-m; i*=2){
            res2 -= (n-m)/i;
        }

        for(long i = 5; i <= n; i*=5){
            res5 += n/i;
        }

        for(long i = 5; i <= m; i*=5){
            res5 -= m/i;
        }

        for(long i = 5; i <= n-m; i*=5){
            res5 -= (n-m)/i;
        }

        System.out.println(Math.min(res2, res5));
    }
}
