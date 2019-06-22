import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());

        String a = st.nextToken(); String b = st.nextToken();

        int len = b.length() - a.length();
        int cnt = 0; int result = Integer.MAX_VALUE;
        for(int i = 0; i <= len; i++){
            cnt = 0;
            for(int j = 0; j < a.length(); j++){
                if(a.charAt(j) != b.charAt(j+i)) cnt++;
            }
            result = Math.min(cnt, result);
        }
        System.out.println(result);
    }
}
