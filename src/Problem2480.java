import java.util.Scanner;

public class Problem2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();

        int price = 0;
        if(a == b && b == c){
            price = 10000 + 1000 * a;
        }else if(a == b){
            price = 1000 + 100 * a;
        }else if(b == c){
            price = 1000 + 100 * b;
        }else if(c == a){
            price = 1000 + 100 * a;
        }else{
            if(a > b && a > c){
                price = 100 * a;
            }else if(b > c){
                price = 100 * b;
            }else{
                price = 100 * c;
            }
        }
        System.out.println(price);
    }
}
