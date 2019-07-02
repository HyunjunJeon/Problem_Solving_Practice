import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10844 {
    // D[n][L] = N자리 계단수의 마지막수가 L
    /*
        D[n-1][l-1]
        D[n-1][l+1]
        두가지 경우가 계단수를 만족시킴

        따라서 D[N][L] = D[n-1][l-1] + D[n-1][l+1] (1 <= L <= 8)
        D[n][0] = D[n-1][1] -> L 이 0인 경우는 없음
        D[n][9] = D[n-1][8]
     */
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());

            long bigNum = 1000000000L;

            long d[][] = new long[n+1][10];

            for(int i = 1; i <=9; i++){
                d[1][i] = 1; // 길이가 1인 경우
            }

            for(int i = 2; i <=n; i++){ // 길이를 2부터 n 까지 늘려가면서
                for(int j = 0; j <= 9; j++){ // 0~ 9까지 차이가날테니...
                    d[i][j] = 0;
                    if(j-1 >= 0) d[i][j] += d[i-1][j-1];
                    if(j+1 <= 9) d[i][j] += d[i-1][j+1];
                    d[i][j] %= bigNum;
                }
            }

            long result = 0;
            for(int i = 0; i <= 9; i++){
                result += d[n][i];
            }
            System.out.println(result%bigNum);
        }
    }
}
