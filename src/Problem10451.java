import java.util.Scanner;

public class Problem10451 {
    private static boolean[] chk;
    private static int[] a;
    private static void dfs(int x){
        while(chk[x] == false){
            chk[x] = true;
            x = a[x];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            a = new int[n+1];
            chk = new boolean[n+1];
            for(int i = 1; i <= n; i++){
                a[i] = sc.nextInt();
            }

            int ans = 0;
            for(int i = 1; i <= n; i++){
                if(!chk[i]){
                    dfs(i);
                    ans += 1;
                }
            }

            System.out.println(ans);
        }

    }
}
