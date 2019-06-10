import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Problem4153 {
    public static void main(String[] args) throws Exception{
        try(Scanner sc = new Scanner(System.in);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            for(;;){
                int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
                if(a == b && b == c && c == 0) break;
                if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b){
                    bw.write("right" + "\n");
                }else{
                    bw.write("wrong" + "\n");
                }
            }
            bw.flush();
        }

    }
}
