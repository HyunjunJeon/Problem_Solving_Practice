import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        StringBuilder sb;

        int t = sc.nextInt();
        sc.nextLine();
        while(t>0){
            st = new StringTokenizer(sc.nextLine());
            sb = new StringBuilder();
            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            char[] strArr = str.toCharArray();
            for(int i = 0; i < strArr.length; i++){
                for(int j = 0; j < num; j++){
                    sb.append(strArr[i]);
                }
            }
            System.out.println(sb.toString());
            t--;
        }
    }
}
