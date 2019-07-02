import java.util.Scanner;

public class Problem1463 {
    private static int[] d; // 정수 N을 1로 만드는데 필요한 연산의 최솟값

    // Top - Down
    private static int goNumberOne(int n){
        if(n == 1) return 0; // 예외처리
        if(d[n] > 0) return d[n]; // 값이 들어있다면 바로 출력
        // Case 1
        d[n] = goNumberOne(n-1) + 1;
        // Case 2
        if(n%2 == 0){
            int tmp = goNumberOne(n/2) + 1; // d[n/2] 까지 가는데 1번 했으니까
            if(d[n] > tmp) d[n] = tmp; // 최소값 저장
        }
        // Case 3
        if(n%3 == 0){
            int tmp = goNumberOne(n/3) + 1; // d[n/3] 까지 가는데 1번 했으니까
            if(d[n] > tmp) d[n] = tmp; // 최소값 저장
        }
        return d[n];
    }

    // Bottom - Up
    private static int goNumberOne2(int n){
        d[1] = 0;
        for(int i = 2; i <= n; i++){
            // Case 1
            d[i] = d[i-1] + 1;
            // Case 2
            if(i%2 == 0 && d[i] > d[i/2] + 1){
                d[i] = d[i/2] + 1;
            }
            // Case 3
            if(i%3 == 0 && d[i] > d[i/3] + 1){
                d[i] = d[i/3] + 1;
            }
        }
        return d[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        d = new int[t+1]; // 0을 포함하지 않으므로 +1 크기를 잡아줌
        System.out.println(goNumberOne(t));
    }
}
