import java.util.Scanner;

public class Problem2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = 0;
        int lcm = 0;

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


    }
}
