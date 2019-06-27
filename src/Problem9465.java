import java.io.*;

public class Problem9465 {
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            int t = Integer.parseInt(br.readLine());
            while(t-- > 0){
                int n = Integer.parseInt(br.readLine());

                long[][] a = new long[n+1][2];
                for(int i= 0; i < 2; i++){
                    String[] line = br.readLine().split(" ");
                    for(int j = 1; j <= n; j++){
                        a[j][i] = Long.valueOf(line[j-1]);
                    }
                }

                long[][] d = new long[n+1][3];
                for(int i = 1; i <= n; i++){
                    d[i][0] = Math.max(d[i-1][0], Math.max(d[i-1][1], d[i-1][2]));
                    d[i][1] = Math.max(d[i-1][0], d[i-1][2]) + a[i][0];
                    d[i][2] = Math.max(d[i-1][0],d[i-1][1])+a[i][1];
                }
                long result = 0;
                result = Math.max(d[n][0], Math.max(d[n][1], d[n][2]));
                System.out.println(result);
            }
        }

    }
}
