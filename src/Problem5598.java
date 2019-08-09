import java.util.Scanner;

public class Problem5598 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] arr = s.toCharArray();

        for(int a : arr){
            a -= 3;
            if(a < 'A'){
                a += 26;
            }
            System.out.print((char)a);
        }

    }
}
