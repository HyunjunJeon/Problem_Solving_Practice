import java.util.Scanner;

public class Problem1748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long cnt = 0;
        while(n > 0){
            cnt += (long)Math.log10(n)+1;
            n--;
        }
        System.out.println(cnt);
    }
}
