import java.util.Scanner;

public class Problem11053 {
    /*
        D[i] = A[1], ... , A[i] 까지 수열이 있을 때, A[i]를 마지막으로 하는 가장 긴 증가하는 부분 수열의 길이
        D[i] = MAX( D[j] ) + 1 ( j < i, A[j] < A[i]) 괄호의 조건: 증가하는 부분 수열이 되어야 하니까
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] d = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            d[i] = 1; // 1개만 있어도 길이는 1
            for(int j = 0; j < i; j++){
                if(a[j] < a[i] && d[i] < d[j] + 1){
                    d[i] = d[j] + 1;
                }
            }
        }

        int result = 0;
        for(int i = 0; i < n; i++){
            if(result < d[i]){ // 최대값~
                result = d[i];
            }
        }

        System.out.println(result);

    }
}
