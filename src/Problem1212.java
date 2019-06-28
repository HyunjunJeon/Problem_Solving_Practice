import java.util.Scanner;

public class Problem1212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] eight = {"000","001","010","011","100","101","110","111"};

        String a = sc.nextLine();
        int len = a.length();
        boolean firstTime = true;

        if(len == 1 && a.charAt(0) == '0'){
            System.out.print("0");
        }

        for(int i = 0; i < len; i++){
            int chk = a.charAt(i) - '0';
            if(firstTime && chk < 4){
                if(chk == 1){
                    System.out.print("1");
                }else if(chk == 2){
                    System.out.print("10");
                }else if(chk == 3){
                    System.out.print("11");
                }
                firstTime = false;
            }else{
                System.out.print(eight[chk]);
                firstTime = false;
            }
        }
    }
}
