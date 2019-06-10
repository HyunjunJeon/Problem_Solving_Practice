import java.util.Scanner;

public class Problem5618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a,b,c;

        if(n == 2){
            a = sc.nextInt();
            b = sc.nextInt();
            c = 0;
        }else{
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }
        for(int i = 1; i <= a; i++){
            if(a%i == 0 && b%i == 0 && c%i == 0){
                System.out.println(i);
            }
        }
    }
}
