import java.util.Scanner;

public class Problem10886 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < a; i++){
            int b = sc.nextInt();
            sum += b;
        }
        if(a/2 < sum){
            System.out.println("Junhee is cute!");
        }else{
            System.out.println("Junhee is not cute!");
        }

    }
}
