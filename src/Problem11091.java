import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem11091 {
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int t = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            while(t-- > 0){
                boolean[] checks = new boolean[26];
                String sentence = br.readLine().toLowerCase().replaceAll(" ", "");
                for(char ch : sentence.toCharArray()){
                    for(int i = 97; i < 123; i++){
                        if (ch == i){
                            checks[i-97] = true;
                            break;
                        }
                    }
                }
                boolean isPangram = true;
                boolean isFirst = true;
                for(int i = 0; i < checks.length; i++){
                    if (!checks[i]){
                        if (isFirst){
                            sb.append("missing ");
                            isFirst = false;
                        }
                        isPangram = false;
                        sb.append((char)(i+97));
                    }
                }
                if (isPangram){
                    sb.append("pangram");
                }
                sb.append("\n");
            }
            System.out.println(sb.toString());
        }
    }
}
