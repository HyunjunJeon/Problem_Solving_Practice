import java.math.BigInteger;
import java.util.Scanner;

public class Problem5988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        for(int i = 0; i < a; i++){
            BigInteger b = sc.nextBigInteger();
            BigInteger c = BigInteger.valueOf(2);
            BigInteger d = BigInteger.valueOf(0);
            if(b.mod(c).equals(d)){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }
    }
}
