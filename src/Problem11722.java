import java.util.Scanner;

public class Problem11722 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n+1];
        int[] d = new int[n+1];
        for(int i = 1; i <= n; i++){ // 이따가 n부터 돌꺼기 때문에 1~N까지 담아줌
            a[i] = sc.nextInt();
        }

        for(int i = n; i >= 1; i--){ // 거꾸로 돌면서
            d[i] = 1; // 1개만 있어도 길이는 1이니까
            for(int j = i+1; j <= n; j++){ // j는 i보다 1개 큰 경우부터 N까지 돌면서
                if(a[i] > a[j] && d[i] < d[j] + 1){ // 앞에 숫자가 더 크고 & 뒤에 부분 수열 길이가 더 길면
                    d[i] = d[j] + 1;
                }
            }
        }

        int result = d[1];
        for(int i = 2; i <= n; i++){
            if(result < d[i]){
                result = d[i];
            }
        }

        System.out.println(result);
    }
}
