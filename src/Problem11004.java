import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem11004 {
    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            StringTokenizer st = null;
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken()); int k = Integer.parseInt(st.nextToken());

            int[] arr =  new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);
            System.out.println(arr[k-1]);
        }
    }
}
