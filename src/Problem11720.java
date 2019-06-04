import java.util.Scanner;

public class Problem11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String b = sc.nextLine();
        char[] c = b.toCharArray();

        int sum = 0;
        for(int i =0; i < a; i++){
            sum+=(int)c[i]-'0';
        }
        System.out.println(sum);

    }
}
