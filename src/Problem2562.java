import java.util.Scanner;

public class Problem2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int count = 0;

        for(int i = 0; i < 9; i++){
            int checkNum = sc.nextInt();
            if(checkNum > max){
                max = checkNum;
                count = i+1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
