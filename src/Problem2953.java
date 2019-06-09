import java.util.Scanner;

public class Problem2953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int win = 0;

        for(int i = 0; i < 5; i++){
            int sum = 0;
            for(int j = 0; j < 4; j++){
                sum += sc.nextInt();
            }
            if(max < sum){
                max = sum;
                win = i+1;
            }
        }
        System.out.println(win + " " + max);
    }
}
