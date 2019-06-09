import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem1427 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        String temp = Long.toString(num);
        Integer[] changeArr = new Integer[temp.length()];
        for(int i = 0; i < temp.length(); i++){
            changeArr[i] = temp.charAt(i) - '0';
        }
        Arrays.sort(changeArr, Collections.reverseOrder());
        for(Integer j : changeArr){
            System.out.print(j);
        }
    }
}
