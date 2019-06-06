import java.util.Scanner;

public class Problem2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        int min = sc.nextInt();

        if(min - 45 < 0){
            if(time - 1 < 0){
                time = 23;
                min += 15;
            }else{
                time -= 1;
                min += 15;
            }
        }else{
            min -= 45;
        }
        System.out.println(time + " " + min);
    }
}
