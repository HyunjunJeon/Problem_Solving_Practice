import java.util.Scanner;

public class Problem2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
        int multiple = a*b*c;

        String str = String.valueOf(multiple);
        char[] arr = str.toCharArray();
        int[] count = new int[10];

        for(int i = 0; i < arr.length; i++){
            count[arr[i]-'0']++;
        }
        for(int j: count){
            System.out.println(j);
        }
    }
}
