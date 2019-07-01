import java.io.*;
import java.util.*;

public class Problem1260 {
    private static boolean[] check; // 방문했는지 Check 하는 배열
    private static ArrayList<Integer>[] a; // 인접리스트 방식을 사용함

    // dfs는 스택으로 구현함,, 재귀함수가 Stack 콜이므로 재귀로 구현하면 됌~
    private static void dfs(int x){
        if(check[x]) return;
        check[x] = true; // 방문했고~
        System.out.print(x + " "); // 1260 - 해당 문제의 출력형식
        for(int y : a[x]){ // 인접리스트에서 노드 x 와 연결된 엣지들을 꺼내서
            if(!check[y]) dfs(y); // 방문하지 않았다면 다음 노드로 이동~
        }
    }

    // bfs는 큐로 구현함,,
    private static void bfs(int x){
        Queue<Integer> queue = new LinkedList<>(); // 노드를 저장할 큐 선언
        check[x] = true; queue.add(x); // 초기값: 방문 체크 후 queue에 넣기(queue에 넣는 것 만으로도 방문으로 check)
        while(!queue.isEmpty()){ // 큐가 빌때까지
            int y = queue.remove(); // 꺼내서
            System.out.print(y + " "); // 1260 - 해당 문제의 출력형식
            for(int z : a[y]){ // 인접리스트에서 노드 x 와 연결된 엣지들을 꺼내서
                if(!check[z]) { // 방문하지 않았다면
                    check[z] = true; queue.add(z); // 방문 체크 & queue에 넣어주기
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

            a = new ArrayList[v+1]; // 엣지 사이즈보다 1개 크게 선언 => 1부터 돌꺼기 때문에~

            for(int i = 1; i <= v; i++){
                a[i] = new ArrayList<>(); // 인접리스트 만들어줌(엣지들을 넣어줄꺼야)
            }

            for(int i = 0; i < e; i++){ // 0 ~ e-1 (E개)
                st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());
                a[from].add(to); a[to].add(from); // 인접리스트 삽입: 양방향으로
            }

            for(int i = 1; i <= v; i++){
                Collections.sort(a[i]); // 노드의 순서대로 각 엣지들 정렬
            }

            check = new boolean[v+1]; // 방문 배열 초기화
            dfs(n);
            System.out.println();

            Arrays.fill(check, false); // 방문 배열 초기화2(bfs에 사용하기 위해서)
            bfs(n);
        }

    }
}
