import java.util.Scanner;

public class Problem2902 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split("-");
        for(String a : strArr){
            System.out.printf("%s", a.charAt(0));
        }
    }
}
