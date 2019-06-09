import java.util.Scanner;

public class Problem1592 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt(); int l = sc.nextInt();
        int[] count = new int[n+1];
        int totalCount = 0;

        int idx = 1;
        count[1] += 1;

        while(true){
            if(m == 1){
                break;
            }
            if(count[idx]%2 == 0){
                idx = idx - l;
                if(idx <= 0){
                    idx += n;
                }
                count[idx]++;
            }else{
                idx = idx + l;
                if(idx > n){
                    idx -= n;
                }
                count[idx]++;
            }
            totalCount++;
            if(count[idx] == m){
                break;
            }
        }
        System.out.println(totalCount);
    }
}
