import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem10539 {
    public static void main(String[] args) throws Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            List<Integer> listA = new ArrayList<>();
            List<Integer> listB = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                listB.add(Integer.parseInt(st.nextToken()));
            }

            listA.add(listB.get(0));
            for(int i = 1; i < n; i++){
                int sum = listA.stream().mapToInt(x -> x).sum();
                listA.add(listB.get(i) * (i+1) - sum);
            }

            listA.forEach(x -> System.out.print(x + " "));
        }
    }
}
