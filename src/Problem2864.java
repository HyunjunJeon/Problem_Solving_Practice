import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2864 {
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            String smallA = a.replaceAll("6", "5");
            String smallB = b.replaceAll("6", "5");

            int small = Integer.parseInt(smallA) + Integer.parseInt(smallB);

            String bigA = a.replaceAll("5", "6");
            String bigB = b.replaceAll("5", "6");

            int big = Integer.parseInt(bigA) + Integer.parseInt(bigB);

            System.out.println(small + " " + big);
        }
    }
}
