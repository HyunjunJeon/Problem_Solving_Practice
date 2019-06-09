import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem10818 {
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());

            int max = 0; int min = 0; int cnt = 0;
            while(st.hasMoreTokens()){
                int a = Integer.parseInt(st.nextToken());
                if(cnt == 0){
                    min = a;
                    max = a;
                    cnt++;
                }else{
                    max = Math.max(max, a);
                    min = Math.min(min, a);
                }
            }
            System.out.println(min + " " + max);
        }

    }
}
