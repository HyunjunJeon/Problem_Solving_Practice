import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem2954 {
    public static void main(String[] args) throws Exception{
        String[] arr = {"apa", "epe", "ipi", "opo", "upu"};
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String sentence = br.readLine();

            String a = sentence.replaceAll(arr[0], "a");
            String b = a.replaceAll(arr[1], "e");
            String c = b.replaceAll(arr[2], "i");
            String d = c.replaceAll(arr[3], "o");
            String e = d.replaceAll(arr[4], "u");
            System.out.println(e);
        }
    }
}
