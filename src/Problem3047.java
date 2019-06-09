import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem3047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());

        int[] inValue = new int[3];
        int idx = 0;
        while(st.hasMoreTokens()){
            inValue[idx] = Integer.parseInt(st.nextToken());
            idx++;
        }
        Arrays.sort(inValue);

        st = new StringTokenizer(sc.nextLine());
        String abc = st.nextToken();
        char[] abcChange = abc.toCharArray();
        int[] matching = new int[abcChange.length];

        for(int i = 0; i < abcChange.length; i++){
            matching[i] = abcChange[i]-'A';
        }

        for(int j = 0; j < matching.length; j++){
            System.out.print(inValue[matching[j]] + " ");
        }
    }
}
