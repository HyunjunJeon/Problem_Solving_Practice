import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem5555 {
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String findWord = br.readLine();
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            while(n-- > 0){
                String input = br.readLine();
                if(input.contains(findWord)){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
