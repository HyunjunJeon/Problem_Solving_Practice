import java.util.Scanner;

public class Problem11943 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int appleA = sc.nextInt(); int orangeA = sc.nextInt();
        int appleB = sc.nextInt(); int orangeB = sc.nextInt();

        int countA = 0, countB = 0;
        countA += (appleB + orangeA);
        countB += (appleA + orangeB);

        System.out.println(Math.min(countA, countB));
    }
}
