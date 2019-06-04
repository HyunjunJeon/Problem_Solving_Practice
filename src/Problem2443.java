import java.util.Scanner;

public class Problem2443 {
    static void piramid(int i, int number) {
        for (int j = 0; j < (number - 1) - i; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < 2 * i + 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (!(number <= 100 && number >= 1)) {
            System.exit(0);
        }
        for (int i = 0; i < number; i++) {
            piramid(i, number);
        }
        for (int i = number - 2; i >= 0; i--) {
            piramid(i, number);
        }
    }
}


