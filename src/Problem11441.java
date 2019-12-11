import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11441 {
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());

            int arr[] = new int[n];
            int arr2[] = new int[n+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
                arr2[i+1] = arr2[i] + arr[i];
            }

            int m = Integer.parseInt(br.readLine());
            for(int j = 0; j < m; j++){
                int result = 0;
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                System.out.println(arr2[b] - arr2[a-1]);
            }
        }
    }
}
