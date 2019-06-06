import java.util.Scanner;

public class Problem2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[8];

        for(int i = 0; i < 8; i++){
            a[i] = sc.nextInt();
        }

        String b = "";
        for(int j = 0; j < a.length -1; j++){
            if(a[j] == a[j+1] - 1){
                b = "ascending";
            }else if(a[j] == a[j+1] + 1){
                b = "descending";
            }else {
                b = "mixed";
                break;
            }
        }
        System.out.println(b);
    }
}
