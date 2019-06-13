import java.util.PriorityQueue;
import java.util.Scanner;

public class Problem2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            pq.offer(sc.nextInt());
        }
        while(!pq.isEmpty()){
            sb.append(pq.poll() + "\n");
        }
        System.out.println(sb.toString());
    }
}
