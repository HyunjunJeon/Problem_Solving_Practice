import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2490 {
    public static String yutnori(int n){
        String result = "";
        switch(n){
            case 3:
                result = "A";
                break;
            case 2:
                result = "B";
                break;
            case 1:
                result = "C";
                break;
            case 0:
                result = "D";
                break;
            case 4:
                result = "E";
                break;
        }
        return result;
    }
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            StringTokenizer st = null;
            int t = 3;
            while(t-- > 0){
                int sum = 0;
                st = new StringTokenizer(br.readLine());
                while(st.hasMoreTokens()){
                    sum += Integer.parseInt(st.nextToken());
                }
                bw.write(yutnori(sum)+"\n");
            }
            bw.flush();
        }
    }
}
