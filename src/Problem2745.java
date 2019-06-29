import java.util.Scanner;

public class Problem2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next(); int b = sc.nextInt();
        sc.close();

        int len = n.length();
        int result = 0;
        for(int i = 0; i < len; i++){
            char chk = n.charAt(i);
            if('0' <= chk && chk <= '9'){
                result = result * b + (chk - '0');
            }else {
                result = result * b + (chk - 'A' + 10); // A가 10을 가리키니까
            }
        }
        System.out.println(result);
    }
}
