import java.util.Arrays;
import java.util.Scanner;

public class Problem7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] weight = new int[n];
        int[] height = new int[n];
        int[] ranking = new int[n];
        int count = 1;

        for(int i = 0; i < n; i++){
            weight[i] = sc.nextInt();
            height[i] = sc.nextInt();
        }

        for(int j = 0; j < n; j++){
            for(int k = 0; k < n; k++){
                if(j != k){
                    if(weight[j] < weight[k] && height[j] < height[k]){
                            count++;
                    }
                }
            }
            ranking[j] = count;
            count = 1;
        }

        for(int t : ranking){
            System.out.print(t + " ");
        }
    }
}
