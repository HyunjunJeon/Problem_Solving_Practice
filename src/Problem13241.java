import java.util.Scanner;

public class Problem13241 {
    public static long GCD(long a, long b){
        if(a < b){ // 들어온 수를 정렬
            long tmp = a;
            a = b;
            b = tmp;
        }
        long result = a % b; // 나머지를 구하고
        if(result == 0){ // Base Case : 나머지 = 0
            return b;
        }
        return GCD(b, result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong(); long b = sc.nextLong();

        System.out.println((a*b)/GCD(a,b));
    }
}
