import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem11365 {
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            while(true){
                String a = br.readLine();
                if(a.equals("END")){
                    break;
                }
                char[] arr = a.toCharArray();
                for(int i = arr.length-1; i >= 0; i--){
                    bw.write(arr[i]);
                }
                bw.write("\n");
            }
            bw.flush();
        }
    }
}
