import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem2667 {
    static class Location {
        private int x;
        private int y;

        Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int[] dx = {0, 0, 1, -1}; // 행의 이동을 나타냄
    private static int[] dy = {1, -1, 0, 0}; // 열의 이동을 나타냄

    private static void bfs(int x, int y, int count, int[][] a, int[][] group, int t){
        Queue<Location> q = new LinkedList<>();
        q.add(new Location(x,y)); group[x][y] = count; // 좌표와 단지번호
        while(!q.isEmpty()){
            Location lo = q.remove();
            int x2 = lo.x; int y2 = lo.y;
            for(int k = 0; k < 4; k++){ // 위,아래,좌,우 4방향이니까
                int nx = x2 + dx[k]; int ny = y2 + dy[k];
                if(0 <= nx && nx < t && 0 <= ny && ny < t ){ // 주어진 정사각형을 벗어나지 않는 범위에서
                    if(a[nx][ny] == 1 && group[nx][ny] == 0) { // 집이고 현재 단지번호가 0이라면
                        q.add(new Location(nx, ny));
                        group[nx][ny] = count;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[][] a = new int[n][n];
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            for(int j = 0; j < s.length(); j++){
                a[i][j] = s.charAt(j) - '0';
            }
        }

        int cnt = 0;
        int[][] group = new int[n][n];
        for(int i = 0; i < n; i++){ // 행~
            for(int j = 0; j < n; j++){ // 열~
                if(a[i][j] == 1 && group[i][j] == 0){ // 집이고, 단지번호가 없으면
                    bfs(i, j, ++cnt, a, group, n);
                }
            }
        }

        int[] ans = new int[cnt]; // cnt가 총 단지의 개수임(연결요소 찾는 것처럼)
        for(int i = 0; i < n; i++){ // 각 단지별로 집이 몇개씩 있는지
            for(int j = 0; j < n; j++){
                if(group[i][j] != 0){ // 단지번호가 있다면
                    ans[group[i][j]-1] += 1; // 해당 단지에 집의 개수를 세어줌
                }
            }
        }

        Arrays.sort(ans); // 오름차순 정렬~

        System.out.println(cnt);
        Arrays.stream(ans).forEach(System.out::println);
    }
}
