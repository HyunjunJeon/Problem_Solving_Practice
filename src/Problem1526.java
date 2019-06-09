import java.util.Scanner;

public class Problem1526 {
    public static boolean goldMinsu(int number){ // 4와 7로만 이루어진 수
        boolean result = false;
        // 4 7 44 47 74 77
        // 자리수로 짤라내서 나머지가 4와 7인지만 확인하면 되는거 아님?
        int index = 0;
        while(number > 0){
            int a = number % 10;
            if(a != 4 && a != 7){
                result = false;
                break;
            }else{
                result = true;
            }
            number /= 10;
            index++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int max = Integer.MIN_VALUE;

        for(int i = num; i > 0; i--){
            if(goldMinsu(i)){
                if(max < i){
                    max = i;
                }
            }
        }
        System.out.println(max);
    }
}
