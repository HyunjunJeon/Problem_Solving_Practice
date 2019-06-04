import java.util.Scanner;

public class Problem1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Integer b = sc.nextInt();
        double c = Double.parseDouble(b.toString());
        System.out.println(a / c);
    }
}
