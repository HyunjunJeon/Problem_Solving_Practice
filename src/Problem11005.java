import java.util.Scanner;

public class Problem11005 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt(); int b = sc.nextInt();

        String ans = "";
        while(n > 0){
            int r = n % b;
            if(r < 10){
                ans += (char)(r + '0');
            }else {
                ans += (char)(r - 10 + 'A');
            }
            n /= b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ans);
        System.out.println(sb.reverse());
    }
}
