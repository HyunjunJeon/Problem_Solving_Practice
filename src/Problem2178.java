import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem2178 {
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};
    static class Location {
        int x;
        int y;

        Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();
        sc.nextLine();

        int[][] a = new int[n][m];
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            for(int j = 0; j < m; j++){
                a[i][j] = s.charAt(j) - '0';
            }
        }

        int[][] dist = new int[n][m]; // 진행 단계
        boolean[][] check = new boolean[n][m];

        Queue<Location> q = new LinkedList<>();
        q.add(new Location(0,0)); check[0][0] = true; dist[0][0] = 1;
        while(!q.isEmpty()){
            Location lo = q.remove();
            int x2 = lo.x; int y2 = lo.y;
            for(int k = 0; k < 4; k++){
                int nx = x2 + dx[k]; int ny = y2 + dy[k];
                if(0 <= nx && nx < n && 0 <= ny && ny < m){
                    if(!check[nx][ny] && a[nx][ny] == 1){
                        q.add(new Location(nx,ny));
                        check[nx][ny] = true;
                        dist[nx][ny] = dist[x2][y2] + 1;
                    }
                }
            }
        }

        System.out.println(dist[n-1][m-1]);

    }
}
