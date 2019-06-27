import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2156 {
    /*
        0번 연속: d[i-1]
        1번 연속: d[i-2] + a[i-1]
        2번 연속: d[i-3] + a[i-1] + a[i]
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
            d[1] = a[1];
            if(n >= 2){
                d[2] = a[1] + a[2];
            }

            for(int i = 3; i <= n; i++){
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
