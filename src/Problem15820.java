import java.util.Scanner;

public class Problem15820 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt(); int s2 = sc.nextInt();
        String answer = "";
        for(int i = 0; i < s1+s2; i++){
            long a = sc.nextLong(); long b = sc.nextLong();
            if(i < s1){
                if(a != b){
                    answer = "Wrong Answer";
                    break;
                }else{
                    answer = "Accepted";
                }
            }else if(s1 <= i && i <= s2){
                if(a != b){
                    answer = "Why Wrong!!!";
                    break;
                }else{
                    answer = "Accepted";
                }
            }

        }
        System.out.println(answer);
    }
}
