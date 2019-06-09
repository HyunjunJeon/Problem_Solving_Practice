import java.util.Scanner;

public class Problem2455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < 4; i++){
            int out = sc.nextInt();
            people -= out;
            int in = sc.nextInt();
            people += in;
            if(max < people){
                max = people;
            }
        }
        System.out.println(max);
    }
}
