import java.util.*;

public class Problem3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] countX = new boolean[1001];
        boolean[] countY = new boolean[1001];
        Arrays.fill(countX, false);
        Arrays.fill(countY, false);

        for(int i = 0; i < 3; i++){
            int x = sc.nextInt();
            if(!countX[x]){
                countX[x] = true;
            }else{
                countX[x] = false;
            }
            int y = sc.nextInt();
            if(!countY[y]){
                countY[y] = true;
            }else{
                countY[y] = false;
            }
        }
        int x = 0;
        int y = 0;
        for(int j = 0; j < countX.length; j++){
            if(countX[j]){
                x = j;
            }
            if(countY[j]){
                y = j;
            }
        }
        System.out.println(x + " " + y);
    }
}
