import java.util.Scanner;

public class Problem2193 {
    // D[n] = n자리 이친수
    // 1. n번째 자리에 0이 오는 경우
        // n-1 번째는 0, 1 둘 다 가능 -> n-1 이친수 + 0을 붙이면  : n번째 이친수 가능
    // 2. n번째 자리에 1이 오는 경우
        // n-1 번째 자리는 무조건 0 만 가능 -> n-2 이친수 + 0, 1 붙이면 : n번째 이친수 가능
    // 따라서 D[n] = D[n-1] + D[n-2]

    // 다른 방식으로
    // D[N][L] : N자리 이친수, 마지막자리 L
    // 1. 0으로 끝남 -> D[N][0] = D[n-1][0] + D[n-1][1]
    // 2. 1으로 끝남 -> D[N][1] = D[n-1][0]

    // 최종 D[N][L] = D[N][0] + D[N][1]
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] d = new long[n+1];
        d[1] = 1;
        if(n >= 2){
            d[2] = 1; // 1이 연속할 수 없으므로 무조건 0이 오니까
        }
        for(int i = 3; i <=n; i++){
            d[i] = d[i-1] + d[i-2];
        }
        System.out.println(d[n]);
    }
}
