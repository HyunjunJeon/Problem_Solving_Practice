import java.io.*;
import java.util.*;

public class Problem1260 {
    private static boolean[] check;
    private static ArrayList<Integer>[] a;

    private static void dfs(int x){
        if(check[x]) return;
        check[x] = true;
        System.out.print(x + " ");
        for(int y : a[x]){
            if(!check[y]) dfs(y);
        }
    }
    private static void bfs(int x){
        Queue<Integer> queue = new LinkedList<>();
        check[x] = true; queue.add(x);
        while(!queue.isEmpty()){
            int y = queue.remove();
            System.out.print(y + " ");
            for(int z : a[y]){
                if(!check[z]) {
                    check[z] = true;
                    queue.add(z);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            StringTokenizer st;

            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken()); // node
            int e = Integer.parseInt(st.nextToken()); // edge
            int n = Integer.parseInt(st.nextToken()); // start

            a = new ArrayList[v+1];

            for(int i = 1; i <= v; i++){
                a[i] = new ArrayList<>();
            }

            for(int i = 0; i < e; i++){ // 0 ~ e-1 (E개)
                st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());
                a[from].add(to); a[to].add(from); // 양방향
            }

            for(int i = 1; i <= v; i++){
                Collections.sort(a[i]); // 각 ArrayList 정렬
            }

            check = new boolean[v+1];
            dfs(n);
            System.out.println();

            Arrays.fill(check, false);
            bfs(n);
        }

    }
}
