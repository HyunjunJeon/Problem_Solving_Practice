import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2156 {
    /*
        0번 연속: d[i-1]
        1번 연속: d[i-2] + a[i-1]  => n-1번째는 마시면 안됌 따라서 n-2마시고, n번째 마심
        2번 연속: d[i-3] + a[i-1] + a[i] => n, n-1번째 마시고, n-2는 마시면 안됌 , n-3은 상관없음
     */
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n+1];
            int[] d = new int[n+1];

            for(int i = 1; i <= n; i++){
                a[i] = Integer.parseInt(br.readLine());
            }

            // 예외처리가 복잡하니까.. 미리 넣어놓고 하는게 쉬운 방법
            d[1] = a[1]; // 포도주가 1개뿐 -> 1개를 먹어버리면 됌
            if(n >= 2){ // 포도주가 2개라면 -> 2개 다 먹어버리면 됌
                d[2] = a[1] + a[2];
            }

            for(int i = 3; i <= n; i++){ // i-3 까지 들어가니까 정답2개를 미리 위에 구해놓음
                d[i] = d[i-1];
                d[i] = Math.max(d[i], d[i-2]+a[i]);
                d[i] = Math.max(d[i], d[i-3]+a[i-1]+a[i]);
            }

            int result = d[1];
            for(int i = 2; i <= n; i++){
                result = Math.max(result, d[i]);
            }
            System.out.println(result);
        }
    }
}
