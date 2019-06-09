import java.util.Scanner;

public class Problem1100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        for(int i = 0; i < 8; i++){
            String abc = sc.nextLine();
            char[] changeString = abc.toCharArray();
            for(int j = 0; j < changeString.length; j++){
                if(i%2 == 0){
                    if(changeString[j] == 'F'){
                        if(j%2 == 0) {
                            count++;
                        }
                    }
                }else{
                    if(changeString[j] == 'F'){
                        if(j%2 == 1) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}