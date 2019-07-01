import java.util.Scanner;

public class Problem2331 {
    private static int[] check = new int[1000000];
    private static int pow(int a, int p) {
        int ans = 1;
        for(int i = 0; i < p; i++){
            ans *= a;
        }
        return ans;
    }
    private static int next(int a, int p) {
        int ans = 0;
        while(a > 0){
            ans += pow(a%10, p);
            a /= 10;
        }
        return ans;
    }
    private static int length(int a, int p , int count) {
        if(check[a] != 0){
            return check[a]-1;
        }
        check[a] = count;
        int b = next(a, p);
        return length(b, p, count+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(length(a, p, 1));
    }
}
