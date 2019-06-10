import java.util.Scanner;

public class Problem2858 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt(); int b = sc.nextInt();
        int w = 0;

        for(int l = 1;; l++){
            if(b % l == 0){
                w = b/l;

                if(r == 2*l + 2*w + 4){
                    System.out.println((w+2) + " " + (l+2));
                    break;
                }
            }
        }
    }
}
