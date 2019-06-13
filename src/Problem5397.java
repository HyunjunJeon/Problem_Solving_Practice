import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class Problem5397 {
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            Stack<Character> left = new Stack<>();
            Stack<Character> right = new Stack<>();

            int t = Integer.parseInt(br.readLine());

            while(t-- >0){
                String str = br.readLine();
                char[] strArr = str.toCharArray();
                for(char a : strArr){
                    if(a == '<') {
                        if(left.size() != 0){
                            right.push(left.peek());
                            left.pop();
                        }
                    }else if(a == '>'){
                        if(right.size() != 0){
                            left.push(right.peek());
                            right.pop();
                        }
                    }else if(a == '-'){
                        if(left.size() != 0){
                            left.pop();
                        }
                    }else{
                        left.push(a);
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
                bw.write("\n");
                bw.flush();
            }
        }
    }
}
