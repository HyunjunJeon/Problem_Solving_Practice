import java.util.Arrays;
import java.util.Scanner;

public class Problem6588 { // 골드바흐의 추측 ( 아직 못춤 )
    public static boolean[] getPrimeByChae(int number){
        boolean[] arr = new boolean[number+1];
        Arrays.fill(arr, true);
        arr[1] = false;

        for(int i = 2; i < number+1; i++){
            for(int j = 2*i; j < number+1; j += i){
                if(!arr[j]) continue;
                arr[j] = false;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while (n != 0){
            int a = sc.nextInt();
            boolean[] ar = getPrimeByChae(a);
            for(int i = 2; i < ar.length; i++){
                for(int j = 2; j < ar.length; j++){
                    if(i != j && i < j){
                        //if(a == ar[i] + ar[j]){

                        //}
                    }
                }
            }
        }
    }
}
