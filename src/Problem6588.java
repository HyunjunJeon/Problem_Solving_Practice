import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem6588 {
    private static final int MAX = 1000000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] chk = new boolean[MAX+1];
        chk[0] = chk[1] = true;

        List<Integer> primeList = new ArrayList<>();

        for (int i=2; i*i <= MAX; i++) {
            if (chk[i]) continue;
            for (int j = i+i; j <= MAX; j+=i) {
                chk[j] = true;
            }
            primeList.add(i);
        }

        while(true){
            int n = sc.nextInt();
            if(n == 0) break;

            for(int i = 1; i < primeList.size(); i++) {
                int a = primeList.get(i);
                if (!chk[n - a]) {
                    int b = n - a;
                    if(a%2 == 1 && b%2 == 1){
                        System.out.println(n + " = " + a + " + " + b);
                    }else {
                        System.out.println("Goldbach's conjecture is wrong.");
                    }
                    break;
                }
            }
        }
    }
}
