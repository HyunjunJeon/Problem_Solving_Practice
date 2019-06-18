import java.util.Scanner;

public class Problem11727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] dynamic = new int[t+1];
        dynamic[0] = 1; dynamic[1] = 1;
        for(int i = 2; i <= t; i++){
            dynamic[i] = dynamic[i-1] + 2*dynamic[i-2];
            dynamic[i] %= 10007;
        }
        System.out.println(dynamic[t]);
    }
}
