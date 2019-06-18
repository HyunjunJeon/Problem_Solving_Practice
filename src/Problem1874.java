import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Problem1874 {
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            StringBuilder sb = new StringBuilder();
            Stack<Integer> stack = new Stack<>();
            int n = Integer.parseInt(br.readLine());

            int max = 0;
            while(n-- > 0){
                int k = Integer.parseInt(br.readLine());
                if(k > max){
                    for(int i = max; i < k; i++){
                        stack.push(i+1);
                        sb.append("+\n");
                    }
                    max = k;
                }else {
                    if(stack.peek() != k) {
                        sb.setLength(0);
                        sb.append("NO");
                        break;
                    }
                }
                stack.pop();
                sb.append("-\n");
            }
            System.out.println(sb.toString());
        }
    }
}
