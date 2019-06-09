import java.util.Scanner;

public class Problem1065 {
    public static boolean seq(int num){
        boolean result = false;
        if(Math.log10((double)num) < 2){ // 1~2자리
            result = true;
        }else{ // 3자리
            int a = num/100;
            int b = (num - a*100)/10;
            int c = num%10;
            if(a-b == b-c){
                result = true;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;

        for(int i = num; i > 0; i--){
            if(seq(i)){
                count++;
            }
        }

        System.out.println(count);
    }
}
