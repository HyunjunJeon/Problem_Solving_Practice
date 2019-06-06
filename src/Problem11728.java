import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem11728 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            br.readLine(); // 처음 한줄은 어차피 뭐가 들어와도 상관없음
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                int m = Integer.parseInt(st.nextToken());
                priorityQueue.offer(m);
            }

            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                int n = Integer.parseInt(st.nextToken());
                priorityQueue.offer(n);
            }

            while(!priorityQueue.isEmpty()){
                bw.write(priorityQueue.poll() + " ");
            }
            bw.flush();
        }


    }
}
