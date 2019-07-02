import java.util.Scanner;

public class Problem11057 {
    /*
        D[N][L]: n자리 오르막수 마지막의 수가 L
        D[N][L] = D[n-1][k] (0 <= K <= L)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int bigNum = 10007;
        long d[][] = new long[n+1][10];

        for(int i = 0; i <=9; i++){
            d[1][i] = 1;
        }

        for(int i = 2; i <= n; i++){
            for(int j = 0; j <= 9; j++){
                for(int k = 0; k <= j; k++){
                    d[i][j] += d[i-1][k];
                    d[i][j] %= bigNum; // 이부분 조심해야함 -> 나머지 연산의 특징
                }
            }
        }
        long result = 0;
        for(int i = 0; i <= 9; i++){
            result += d[n][i];
        }
        System.out.println(result%bigNum);
    }
}
