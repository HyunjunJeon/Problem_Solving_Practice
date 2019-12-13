import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem2789 {
    public static String wordChecker(String word){
        char[] checks = {'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E'};
        for(char check : checks){
            word = word.replaceAll(String.valueOf(check), "");
        }
        return word;
    }
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String word = br.readLine();
            System.out.println(wordChecker(word));
        }
    }
}
