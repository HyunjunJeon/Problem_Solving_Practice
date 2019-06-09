import java.util.*;

public class Problem11652 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Long> inValue = new ArrayList<>();
        for(int i = 0; i < n; i++){
            inValue.add(sc.nextLong());
        }
        Collections.sort(inValue);

        long maxValue = inValue.get(0);
        int maxCount = 0;
        int count = 0;

        for(int j = 1; j < n; j++){
            if(inValue.get(j).equals(inValue.get(j-1))){
                count++;
            }else{
                count = 0;
            }

            if(maxCount < count){
                maxCount = count;
                maxValue = inValue.get(j);
            }
        }
        System.out.println(maxValue);
    }
}
