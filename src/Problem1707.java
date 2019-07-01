import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1707 {
    private static void dfs(int x, List<Integer>[] a, int[] color, int c){
        color[x] = c;
        for(int y : a[x]){
            if(color[y] == 0){
                dfs(y, a, color, 3-c); // 1->2 & 2 -> 1 따라서 c -> 3-c
            }
        }
    }
//    private static int[] color;
//    private static Vector<Integer>[] adjacentList;
//
//    private static boolean bfs(int x, int c){
//        color[x] = c;
//        for(int i = 0; i < adjacentList[x].size(); i++){
//            int next = adjacentList[x].get(i);
//            if(color[next] == 0){
//                if(!bfs(next, 3-c)){
//                    return true;
//                }
//            }else if(color[next] == color[x]){
//                return false;
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt(); int m = sc.nextInt();
            List<Integer>[] adjacentList = new ArrayList[n+1];
            int[] color = new int[n+1];

            for(int i = 1; i <= n; i++){
                adjacentList[i] = new ArrayList<>();
                color[i] = 0;
            }

            for(int i = 0; i < m; i ++){
                int from = sc.nextInt(); int to = sc.nextInt();
                adjacentList[from].add(to);
                adjacentList[to].add(from);
            }

            for(int i = 1; i <= n; i++){
                if(color[i] == 0){
                    dfs(i, adjacentList, color, 1);
                }
            }

            boolean chk = true;
            for(int i = 1; i <= n; i++){
                for(int j : adjacentList[i]){
                    if(color[i] == color[j]){
                        chk = false;
                    }
                }
            }

            System.out.println(chk ? "YES" : "NO");
        }
    }
}
