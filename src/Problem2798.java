import java.util.Scanner;

public class Problem2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt();

        int sum = 0;
        int[] val = new int[n];

        for(int i = 0; i < n; i++){
            val[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    if(i != j && j != k && k != i){
                        int tmp = val[i] + val[j] + val[k];
                        if(tmp <= m && sum < tmp){
                            sum = tmp;
                        }
                    }
                }
            }
        }
        System.out.println(sum);

    }
}
