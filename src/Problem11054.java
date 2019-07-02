import java.util.Scanner;

public class Problem11054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int[] d1 = new int[n];
        for(int i = 0; i < n; i++){
            d1[i] = 1;
            for(int j = 0; j < i; j++){
                if(a[j] < a[i] && d1[i] < d1[j] + 1){
                    d1[i] = d1[j] + 1;
                }
            }
        }

        int[] d2 = new int[n];
        for(int i = n-1; i >= 0; i--){
            d2[i] = 1;
            for(int j = i+1; j < n; j++){
                if(a[i] > a[j] && d2[i] < d2[j] + 1){
                    d2[i] = d2[j] + 1;
                }
            }
        }

        int result = d1[0] + d2[0] -1;
        for(int i = 0; i < n; i++){
            if(result < d1[i] + d2[i] -1){
                result = d1[i] + d2[i] -1;
            }
        }

        System.out.println(result);
    }
}
