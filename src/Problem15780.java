import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem15780 {
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            if(n > k){
                st = new StringTokenizer(br.readLine());
                int cnt = 0;
                while(k-- > 0){
                    int chk = Integer.parseInt(st.nextToken());
                    if(chk <= 4){
                        cnt += 2;
                    }else if(chk <= 6){
                        cnt += 3;
                    }else{
                        cnt += 4;
                    }
                }
                if(cnt >= n){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                st = new StringTokenizer(br.readLine());
                System.out.println("YES");
            }
        }
    }
}
