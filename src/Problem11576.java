import java.util.Scanner;

public class Problem11576 {
    private static void convert(int a, int b){
        if(a == 0){
            return;
        }
        convert(a/b, b);
        System.out.print(a%b+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a =  sc.nextInt(); // A진법
        int b =  sc.nextInt(); // B진법
        int n =  sc.nextInt(); // A진법 숫자의 자리수
        int res = 0;

        for(int i = 0; i < n; i++){
            int c = sc.nextInt(); // A진법의 수
            res = res * a + c; // 10진법으로 변환
        }
        convert(res, b); // res를 B진법으로 변환
    }
}
