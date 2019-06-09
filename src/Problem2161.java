import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class Problem2161 {
    public static void main(String[] args) throws Exception{
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            LinkedList<Integer> ll = new LinkedList<>();

            for(int i = 1; i < n+1; i++){
                ll.add(i);
            }

            for(int j = ll.size(); j > 0; j--){
                // 젤 위에꺼 하나 꺼내고
                bw.write(ll.pollFirst() + " ");
                // 마지막으로 옮기고
                ll.addLast(ll.pollFirst());
            }
            bw.flush();
        }
    }
}
