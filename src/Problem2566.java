import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2566 {
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            StringTokenizer st = null;
            int max = -2147483648;
            int tmp = 0;
            int row = 0;
            int column = 0;

            for(int i = 1; i < 10; i++){
                st = new StringTokenizer(br.readLine());
                int j = 1;
                while(st.hasMoreTokens()){
                    int b = Integer.parseInt(st.nextToken());
                    if(max < b){
                        max = b;
                        row = i;
                        column = j;
                    }
                    j++;
                }
            }
            System.out.println(max);
            System.out.println(row + " " + column);
        }
    }
}
