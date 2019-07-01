import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1018 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            char[][] board = new char[n][m];

            for(int i = 0; i < n; i++){
                String chk = br.readLine();
                for(int j = 0; j < m; j++){
                    board[i][j] = chk.charAt(j);
                }
            }

            // 다시 칠해야 하는 값의 최소...
            // 다시 칠해야 하는 전체를 구해야함..
            // 88로 자르는 경우
        }
    }
}
