import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        StringTokenizer st = null;
        while(t > 0){
            st = new StringTokenizer(sc.nextLine(),",");
            int a = Integer.parseInt(st.nextToken()); int b = Integer.parseInt(st.nextToken());
            System.out.println(a+b);
            t--;
        }
    }
}
