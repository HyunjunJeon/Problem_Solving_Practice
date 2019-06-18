import java.util.Scanner;

public class Problem1463 {
    private static int[] d;
    private static int goNumberOne(int n){
        if(n == 1) return 0;
        if(d[n] > 0) return d[n];
        d[n] = goNumberOne(n-1) + 1;
        if(n%2 == 0){
            int tmp = goNumberOne(n/2) + 1;
            if(d[n] > tmp) d[n] = tmp;
        }
        if(n%3 == 0){
            int tmp = goNumberOne(n/3) + 1;
            if(d[n] > tmp) d[n] = tmp;
        }
        return d[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        d = new int[t+1];
        System.out.println(goNumberOne(t));
    }
}
