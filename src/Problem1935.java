import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem1935 {
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            int n = Integer.parseInt(br.readLine());
            int[] result = new int[n];

            String postfix = br.readLine();
            Stack<Double> st = new Stack<>();

            for(int i = 0; i < n; i++){
                result[i] = Integer.parseInt(br.readLine());
            }

            double v1, v2;
            for(int i = 0; i < postfix.length(); i++){
                char check = postfix.charAt(i);
                if(check == '*'){
                    v1 = st.pop();
                    v2 = st.pop();
                    st.push(v1*v2);
                }else if(check == '+'){
                    v1 = st.pop();
                    v2 = st.pop();
                    st.push(v1+v2);
                }else if(check == '-'){
                    v1 = st.pop();
                    v2 = st.pop();
                    st.push(v2-v1);
                }else if(check == '/'){
                    v1 = st.pop();
                    v2 = st.pop();
                    st.push(v2/v1);
                }else{
                    st.push((double)result[(check-'A')]);
                }
            }
            System.out.printf("%.2f", st.pop());
        }
    }
}
