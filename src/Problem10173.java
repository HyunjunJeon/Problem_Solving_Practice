import java.util.Scanner;

public class Problem10173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String s = sc.nextLine();
            if(s.equals("EOI")) break;
            int cnt = 0;
            if(s.toLowerCase().contains("nemo")) cnt++;
            if(cnt > 0){
                System.out.println("Found");
            } else {
                System.out.println("Missing");
            }
        }
    }
}