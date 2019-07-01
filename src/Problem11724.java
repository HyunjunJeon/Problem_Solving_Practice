import java.util.ArrayList;
import java.util.Scanner;

public class Problem11724 {
    private static void dfs(int x, ArrayList<Integer>[] a, boolean[] chk){
        if(chk[x]) return;
        chk[x] = true;
        for(int y : a[x]){
            if(!chk[y]){
                dfs(y,a,chk);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();

        ArrayList<Integer>[] adjacentList = new ArrayList[n+1];

        for(int i = 1; i <= n; i++){
            adjacentList[i] = new ArrayList<>();
        }

        for(int i = 0; i < m; i++){
            int from = sc.nextInt(); int to = sc.nextInt();
            adjacentList[from].add(to);
            adjacentList[to].add(from);
        }

        boolean[] check = new boolean[n+1];
        int ans = 0;
        for(int i = 1; i <= n; i++){
            if(!check[i]){
                dfs(i, adjacentList, check);
                ans += 1; // dfs가 한번 끝날때마다 연결이 한번 끊어진 것.
            }
        }

        System.out.println(ans);
    }
}
