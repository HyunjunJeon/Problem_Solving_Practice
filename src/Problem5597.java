import java.util.Arrays;
import java.util.Scanner;

public class Problem5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] a = new boolean[31];
        Arrays.fill(a, false);

        for(int i = 0; i < 28; i++){
            int b = sc.nextInt();
            a[b] = true;
        }

        for(int j = 0; j < a.length; j++){
            if(!a[j] && j != 0){
                System.out.println(j);
            }
        }
    }
}
