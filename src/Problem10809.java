import java.util.Scanner;

public class Problem10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 97; i < 123; i++){
            String check = Character.toString((char)i);
            System.out.printf("%s ", str.indexOf(check));
        }
    }
}
