import java.util.Arrays;
import java.util.Scanner;

public class Problem1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt();
        boolean[] chk = new boolean[m+1];

        chk[0] = chk[1] = true;

        for(int i = 2; i * i <= m; i++){
            if(chk[i]) continue;
            for(int j = i+i; j <= m; j+=i){ // i * i 부터 시작하면 더 빠르지만,,, 수의 범위때문
                chk[j] = true;
            }
        }
        for(int i = n; i <= m; i++){
            if(!chk[i]){
                System.out.println(i);
            }
        }

    }
}
