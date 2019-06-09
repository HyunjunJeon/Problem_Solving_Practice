import java.util.Arrays;
import java.util.Scanner;

public class Problem3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] remainder = new boolean[42];
        Arrays.fill(remainder, false);

        for(int i = 0; i < 10; i++){
            int a = sc.nextInt();
            int remain = a%42;
            remainder[remain] = true;
            if(remainder[remain]){
                continue;
            }
        }

        int count = 0;
        for(int j = 0; j<remainder.length; j++){
            if(remainder[j]){
                count++;
            }
        }
        System.out.println(count);
    }
}
