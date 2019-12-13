import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1316 {
    public static boolean isGroupWord(String word){
        boolean result = true;
        boolean[] checks = new boolean[26];
        char[] words = word.toCharArray();
        char prev = words[0];

        for(char ch : words){
            if (prev != ch){
                if(checks[ch-97]){
                    result = false;
                    break;
                } else {
                    checks[ch-97] = true;
                    prev = ch;
                }
            } else {
                if(!checks[ch-97]) checks[ch-97] = true;
                prev = ch;
            }
        }
        return result;
    }
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            while(n-- > 0){
                if(isGroupWord(br.readLine())) cnt++;
            }
            System.out.println(cnt);
        }
    }
}
