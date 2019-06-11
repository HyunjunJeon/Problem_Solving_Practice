import java.util.Scanner;

public class Problem10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == b && a == 0) break;
            System.out.println(a+b);
        }
    }
}
