import java.util.Scanner;

public class Problem9012 {
    private static String isValid(String str){
        str.trim();
        int n = str.length();
        int count = 0;

        for(int i = 0; i < n; i++){
            if(str.charAt(i) == '('){
                count++;
            }else{
                count--;
            }
            if(count < 0){
                return "NO";
            }
        }
        if(count == 0){
            return "YES";
        }else{
            return "NO";
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while(t-- > 0){
            System.out.println(isValid(sc.nextLine()));
        }


    }
}
