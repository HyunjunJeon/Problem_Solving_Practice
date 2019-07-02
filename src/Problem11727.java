import java.util.Scanner;

// 2 x n 타일링2
public class Problem11727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] dynamic = new int[t+1];
        dynamic[0] = 1;
        dynamic[1] = 1;

        for(int i = 2; i <= t; i++){
            dynamic[i] = dynamic[i-1] + 2 * dynamic[i-2]; // 나오는 점화식
            dynamic[i] %= 10007; // 정답 출력을 위해서
        }
        System.out.println(dynamic[t]);
    }
}
