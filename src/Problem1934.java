import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Problem1934 {
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

            int n = sc.nextInt();

            for(int i = 0; i < n; i++){
                int a = sc.nextInt(); int b = sc.nextInt();
                int gcd = GCD(a,b);
                int lcm = a*b/gcd;
                bw.write(lcm + "\n");
            }
            bw.flush();
        }


    }
}
