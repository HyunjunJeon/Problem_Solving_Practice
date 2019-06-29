import java.util.Scanner;

public class Problem11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=2; i*i <= n; i++) {
            while (n%i == 0) {
                System.out.printf("%d\n", i);
                n /= i;
            }
        }
        if (n > 1) { // sqrt(n) 이 1보다 큰 경우는 자기자신 밖에 없음..
            System.out.printf("%d\n", n);
        }
    }
}
