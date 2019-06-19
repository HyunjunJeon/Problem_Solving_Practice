import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Problem1773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int c = sc.nextInt();
        boolean[] arr = new boolean[c+1];

        while(n-- > 0){
            int a = sc.nextInt();
            for(int i = 1; i <= c; i++){
                if(a*i < arr.length && !arr[a*i]){
                    arr[a*i] = true;
                }
            }
        }

        int cnt = 0;
        for(boolean chk : arr){
            if(chk) cnt++;
        }
        System.out.println(cnt);
    }
}
