import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem15969 {
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            br.readLine();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                int i = Integer.parseInt(st.nextToken());
                if (i > max){
                    max = i;
                }
                if(i < min){
                    min = i;
                }
            }
            System.out.println(max - min);
        }
    }
}
