import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Problem1406 {
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            StringTokenizer st = null;
            StringBuilder sb = new StringBuilder();

            Stack<Character> left = new Stack<>();
            Stack<Character> right = new Stack<>();

            String start = br.readLine();
            char[] startArr = start.toCharArray();
            for(char a : startArr){
                left.push(a);
            }

            int t = Integer.parseInt(br.readLine());
            while(t-- > 0){
                st = new StringTokenizer(br.readLine());
                String cli = st.nextToken();
                char cliChar = cli.toCharArray()[0];
                if(cliChar == 'P'){
                    String add = st.nextToken();
                    left.push(add.toCharArray()[0]);
                }else if(cliChar == 'L'){
                    if(left.size() != 0){
                        right.push(left.peek());
                        left.pop();
                    }
                }else if(cliChar == 'D'){
                    if(right.size() != 0){
                        left.push(right.peek());
                        right.pop();
                    }
                }else{
                    if(left.size() != 0){
                        left.pop();
                    }
                }
            }
            int lSize = left.size();
            for(int i = 0; i < lSize; i++){
                right.push(left.peek());
                left.pop();
            }

            int rSize = right.size();
            for(int j = 0; j < rSize; j++){
                bw.write(right.peek());
                right.pop();
            }
            bw.flush();
        }
    }
}
