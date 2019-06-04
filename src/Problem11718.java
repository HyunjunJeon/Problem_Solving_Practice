import java.util.Scanner;

public class Problem11718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String out = sc.nextLine();
            if (out.length() <= 100) {
                System.out.println(out);
            }
        }
    }
}
