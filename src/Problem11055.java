import java.util.Scanner;

public class Problem11055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] d = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            d[i] = a[i];
            for(int j = 0; j < i; j++){
                if(a[j] < a[i] && d[i] < d[j] + a[i]){
                    d[i] = d[j] + a[i];
                }
            }
        }

        int result = 0;
        for(int i = 0; i < n; i++){
            if(result < d[i]){
                result = d[i];
            }
        }

        System.out.println(result);
    }
}
