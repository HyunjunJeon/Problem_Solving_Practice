import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem1158 {
    public static void main(String[] args) throws Exception{
        try(Scanner sc = new Scanner(System.in);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            int n = sc.nextInt(); int k = sc.nextInt();

            Queue<Integer> queue = new LinkedList<>();
            for(int i = 1; i <= n; i++){
                queue.offer(i);
            }
            bw.write("<");
            for(int i = 0; i < n-1; i++){
                for(int j = 0; j < k-1; j++){
                    queue.offer(queue.poll());
                }
                bw.write(String.format("%d, ",queue.poll()));
            }
            bw.write(String.format("%d>\n", queue.poll()));
            bw.flush();
        }
    }
}
