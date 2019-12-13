import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem4493 {
    public static String rockScissorsPaper(String a, String b){
        String result = "";
        if (a.equalsIgnoreCase(b)) result = "TIE";
        if(a.equalsIgnoreCase("R") && b.equalsIgnoreCase("S")){
            result = "Player 1";
        }else if(a.equalsIgnoreCase("R") && b.equalsIgnoreCase("P")){
            result = "Player 2";
        }else if(a.equalsIgnoreCase("S") && b.equalsIgnoreCase("R")){
            result = "Player 2";
        }else if(a.equalsIgnoreCase("S") && b.equalsIgnoreCase("P")){
            result = "Player 1";
        }else if(a.equalsIgnoreCase("P") && b.equalsIgnoreCase("R")){
            result = "Player 1";
        }else if(a.equalsIgnoreCase("P") && b.equalsIgnoreCase("S")){
            result = "Player 2";
        }
        return result;
    }
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int t = Integer.parseInt(br.readLine());
            StringTokenizer st;
            while(t-- > 0){
                int p1 = 0; int p2 = 0;
                int n = Integer.parseInt(br.readLine());
                while(n-- > 0){
                    st = new StringTokenizer(br.readLine());
                    String result = rockScissorsPaper(st.nextToken(), st.nextToken());
                    switch(result){
                        case "Player 1":
                            p1++;
                            break;
                        case "Player 2":
                            p2++;
                            break;
                        case "TIE":
                            p1++;
                            p2++;
                            break;
                    }
                }
                if (p1 > p2){
                    System.out.println("Player 1");
                }else if(p2 > p1){
                    System.out.println("Player 2");
                }else{
                    System.out.println("TIE");
                }
            }
        }
    }
}
