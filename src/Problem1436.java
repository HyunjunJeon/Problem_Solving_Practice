import java.util.Scanner;

public class Problem1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;

        while(number>0){
            String str = Integer.toString(++count);
            if(str.contains("666"))number--;
        }
        System.out.println(count);
    }
}
