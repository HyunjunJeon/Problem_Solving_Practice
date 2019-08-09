import java.util.Scanner;

public class Problem5586 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 0;
        String s = sc.nextLine();

        for(int i = 0; i < s.length()-2; i++){
            String chk = s.substring(i, i+3);
            if(chk.equals("JOI")){
                a++;
            } else if(chk.equals("IOI")){
                b++;
            }
        }
        System.out.println(a + "\n" + b);
    }
}
