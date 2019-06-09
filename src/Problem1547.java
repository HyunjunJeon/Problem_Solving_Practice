import java.util.Scanner;

public class Problem1547 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ballCup = 1;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt(); int b = sc.nextInt();
            if(a == ballCup){
                ballCup = b;
            }else if(b == ballCup){
                ballCup = a;
            }
        }
        System.out.println(ballCup);
    }
}
