import java.util.Scanner;

public class Problem1373 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        int len = a.length();

        if(len % 3 == 1) {
            System.out.print(a.charAt(0));
        }else if(len % 3 == 2){
            System.out.print( (a.charAt(0)-'0') * 2 + (a.charAt(1)-'0'));
        }

        for(int i = len%3; i < len; i+=3){
            System.out.print((a.charAt(i)-'0') * 4 + (a.charAt(i+1)-'0') * 2 + (a.charAt(i+2)-'0') );
        }
    }
}
