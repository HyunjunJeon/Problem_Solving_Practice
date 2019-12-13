import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem10823 {
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String input = "";
            StringBuilder sb = new StringBuilder();
            while((input = br.readLine()) != null) {
                sb.append(input);
            }
            int sum = 0;
            StringTokenizer st = new StringTokenizer(sb.toString(), ",");
            while(st.hasMoreTokens()){
                sum += Integer.parseInt(st.nextToken());
            }
            System.out.println(sum);
        }
    }
}
