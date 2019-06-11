import java.util.Scanner;

public class Problem11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int c = 1;
        while(t > 0){
            int a = sc.nextInt(); int b = sc.nextInt();
            System.out.println("Case #"+c+": "+a+" + "+b+" = "+(a+b));
            c++; t--;
        }

    }
}
