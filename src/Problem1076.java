import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Problem1076 {
    public static int stringToNumber(String word){
        int result = 0;
        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        for(int i = 0; i < colors.length; i++){
            if (word.equalsIgnoreCase(colors[i])){
                result = i;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String a = br.readLine();
            String b = br.readLine();
            String c = br.readLine();

            int i = stringToNumber(a);
            int j = stringToNumber(b);
            String num = String.valueOf(i) + String.valueOf(j);
            int k = stringToNumber(c);
            BigInteger bi = new BigInteger(String.format("%.0f",Integer.parseInt(num) * Math.pow(10, k)));
            System.out.println(bi.toString());
        }
    }
}
