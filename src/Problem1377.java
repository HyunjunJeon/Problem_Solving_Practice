import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1377 {
    // 문제의 답: 버블소트가 몇단계 일어나는가?
    // 앞으로 오는 수 중 MAX+1가 단계를 결정한다
    // INDEX 도 저장을 해야함...
    static class Bubble{
        int num;
        int idx;

        Bubble(int num, int idx) {
            this.num = num;
            this.idx = idx;
        }
    }

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            int n = Integer.parseInt(br.readLine());
            Bubble[] arr = new Bubble[n];

            int max = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++){
                arr[i] = new Bubble(Integer.parseInt(br.readLine()), i);
            }

            for(int i = 0; i < n; i++){
                if(max < arr[i].idx){
                    max = arr[i].idx - i;
                }
            }
            System.out.println(max+1);
        }
    }
}