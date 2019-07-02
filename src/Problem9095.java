import java.util.Scanner;

public class Problem9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] d = new int[11];
        d[0] = 1; // 1,2,3 한가지씩 방법밖에 없으니까

        for(int i = 1; i <= 10; i++){ // n은 11보다 작은 자연수
            for(int j = 1; j <= 3; j++){ // 1,2,3 => 3개의 합으로 나타내는 방법이니까
                if(i-j >= 0){ // 맨마지막에서 j를 뺏을때 0보다 커야만 D[n] = d[n-1]+d[n-2]+d[n-3] 이 성립하므로
                    d[i] += d[i-j];
                }
            }
        }

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(d[n]);
        }
    }
}
