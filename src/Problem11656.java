import java.util.Arrays;
import java.util.Scanner;

public class Problem11656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String check = sc.nextLine();
        int len = check.length();
        String[] arr = new String[len];

        for(int i = 0; i < len; i++){
            arr[i] = check.substring(i,len);
        }
        Arrays.sort(arr);

        for(String a : arr){
            System.out.println(a);
        }
    }
}
