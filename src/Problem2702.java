import java.util.Scanner;

public class Problem2702 {
    public static int GCD(int a, int b){
        if(a < b){ // 들어온 수를 정렬
            int tmp = a;
            a = b;
            b = tmp;
        }
        int result = a % b; // 나머지를 구하고
        if(result == 0){ // Base Case : 나머지 = 0
            return b;
        }
        return GCD(b, result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int gcd = GCD(a,b);
            int lcm = (a*b)/gcd;
            System.out.println(lcm + " " + gcd);
        }

    }
}
