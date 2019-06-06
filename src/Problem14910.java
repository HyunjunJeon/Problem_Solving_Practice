import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem14910 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(new Scanner(System.in).nextLine());

        int prev = Integer.parseInt(st.nextToken());
        boolean isDesc = false;
        while(st.hasMoreTokens()){
            int next = Integer.parseInt(st.nextToken());
            if(prev > next) isDesc = true;
            prev = next;
        }
        System.out.println(isDesc ? "Bad" : "Good");
    }
}
