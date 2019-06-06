import java.util.Arrays;
import java.util.Scanner;

public class Problem11966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] b = new int[31];
        b[0] = 1;
        for(int i=1; i < 31; i++){
            b[i] = b[i-1] * 2;
        }

        Arrays.sort(b);
        if(Arrays.binarySearch(b, a) >= 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}