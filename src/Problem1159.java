import java.util.Scanner;

public class Problem1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lastName = new int[26];

        int n = sc.nextInt();
        sc.nextLine();

        while(n-- > 0){
            String lName = sc.nextLine();
            char check = lName.charAt(0);
            lastName[check - 'a']++;
        }

        int cnt = 0;
        for(int i = 0; i < lastName.length; i++){
            if(lastName[i] >= 5){
                System.out.print((char)(i+97));
                cnt++;
            }
            if(i == lastName.length-1 && cnt == 0){
                System.out.println("PREDAJA");
            }
        }

    }
}
