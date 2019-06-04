import java.util.Scanner;

public class Problem2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // 5
        for (int i = number; i > 0; i--) { // 0 1 2 3 4
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
