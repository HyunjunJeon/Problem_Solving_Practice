import java.util.Scanner;

public class Problem2609 {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = GCD(a,b);
        int lcm = (a*b)/gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
/*
for(int i = 1; i <= Math.max(a,b); i++){
            if(a%i == 0 && b%i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);

        for(int i = Math.max(a,b); i <= a*b; i++){
            if(i%a == 0 && i%b == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println(lcm);
 */
