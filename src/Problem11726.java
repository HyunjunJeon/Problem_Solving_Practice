import java.util.Scanner;

// 2 x n 타일링
public class Problem11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] dynamic = new int[t+1]; // D[n] = 2 x n 채우는 방법의 수
        dynamic[0] = 1; // 제일 작은 크기를 임의로 넣어줌
        dynamic[1] = 1; // 2 x 1은 세로에 세로, 가로뒤에 가로 (0 번째에서 가로1개, 세로 1개씩 더 붙였다고 생각해도됌)

        for(int i = 2; i <= t; i++){
            dynamic[i] = dynamic[i-1] + dynamic[i-2]; // 마지막에 세로1개 + 마지막에 가로 2개
            dynamic[i] %= 10007; // 정답 출력을 위한 작업
        }
        System.out.println(dynamic[t]);
    }
}
