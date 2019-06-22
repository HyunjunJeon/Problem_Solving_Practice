import java.util.Scanner;

public class Problem15725 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] arr = a.toCharArray();

        int idx = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'x'){
                idx = i;
            }
        }

        if(idx == -1){
            System.out.println(0);
        }else if(idx == 0 || (idx == 1 && arr[0] == '-')){
            if(idx == 0){
                System.out.println(1);
            }else{
                System.out.println(-1);
            }
        }else{
            System.out.println(a.split("x")[0]);
        }
    }
}
