import java.util.Scanner;

public class Problem2857 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] chk = new boolean[5];

        for(int i = 0 ; i < 5; i++){
            String s = sc.nextLine();
            if(s.contains("FBI")){
                chk[i] = true;
            }
        }

        int cnt = 0;
        for(int i = 0; i < chk.length; i++){
            if(chk[i]){
                cnt++;
                System.out.print(i+1 + " ");
            }
        }
        if(cnt == 0){
            System.out.println("HE GOT AWAY!");
        }
    }
}
