import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem4641 {
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            StringTokenizer st = null;

            while(true){
                int cnt = 0;
                st = new StringTokenizer(br.readLine());
                int[] arr = new int[st.countTokens()];
                for(int i = 0; i < arr.length; i++){
                    arr[i] = Integer.parseInt(st.nextToken());
                }
                if(arr[0] == -1){
                    break;
                }
                for(int i = 0; i < arr.length; i++){
                    if(arr[i] != 0){
                        for(int j = 0; j < arr.length; j++){
                            if(arr[j] == arr[i]*2){
                                cnt++;
                            }
                        }
                    }
                }
                bw.write(cnt+"\n");
            }
            bw.flush();
        }
    }
}
