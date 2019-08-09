import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem5656 {
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            int idx = 1;
            while(true){
                StringTokenizer st = new StringTokenizer(br.readLine());
                while(st.hasMoreTokens()){
                    int a = Integer.parseInt(st.nextToken());
                    String b = st.nextToken();
                    int c = Integer.parseInt(st.nextToken());
                    if(b.equals("E")) {
                        bw.flush();
                        return;
                    }
                    boolean result = false;
                    switch(b){
                        case ">":
                            result = a > c;
                            break;
                        case ">=":
                            result = a >= c;
                            break;
                        case "<":
                            result = a < c;
                            break;
                        case "<=":
                            result = a <= c;
                            break;
                        case "==":
                            result = a == c;
                            break;
                        case "!=":
                            result = a != c;
                            break;
                    }
                    bw.write("Case "+ idx++ +": " + result+"\n");
                }
            }
        }
    }
}
