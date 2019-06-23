import java.util.Scanner;

public class Problem17009 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int t = 6;
        int a = 0;
        int b = 0;
        while(t-- > 0){
            if(t >= 3){
                if(t==5) a += 3 * sc.nextInt();
                if(t==4) a += 2 * sc.nextInt();
                if(t==3) a += sc.nextInt();
            }else{
                if(t==2) b += 3 * sc.nextInt();
                if(t==1) b += 2 * sc.nextInt();
                if(t==0) b += sc.nextInt();
            }
        }
        if(a > b){
            System.out.println("A");
        }else if(a == b){
            System.out.println("T");
        }else{
            System.out.println("B");
        }
    }
}
