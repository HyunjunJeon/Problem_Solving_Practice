import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Problem13752 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        try(BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out))){
            for(int i = 0; i < a; i ++){
                int b = sc.nextInt();
                for(int j = 0; j < b; j++){
                    br.write("=");
                }
                br.write("\n");
                br.flush();
            }
        }
    }
}
