import java.util.Scanner;

public class Problem10987 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        char[] b = a.toCharArray();
        int count = 0;

        for(int i = 0; i < b.length; i++){
           switch(b[i]){
               case 'a':
                   count++;
                   break;
               case 'e':
                   count++;
                   break;
               case 'i':
                   count++;
                   break;
               case 'o':
                   count++;
                   break;
               case 'u':
                   count++;
                   break;
           }
        }
        System.out.println(count);

    }
}
