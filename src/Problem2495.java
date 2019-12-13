import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem2495 {
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 3; i++){
                String a = br.readLine();
                int countA = 1;
                int maxA = 1;
                char[] chars = a.toCharArray();
                char prev = 0;
                for(char ch : chars){
                    if (prev == ch){
                        countA++;
                        if(maxA < countA){
                            maxA = countA;
                        }
                    } else{
                        countA = 1;
                    }
                    prev = ch;
                }
                sb.append(maxA).append("\n");
            }
            System.out.println(sb.toString());
        }
    }
}
