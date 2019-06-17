import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Problem10866 {
    public static void main(String[] args) throws  Exception{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

            StringTokenizer st = null;
            Deque<Integer> deq = new LinkedList<>();
            int n = Integer.parseInt(br.readLine());

            while(n-- > 0){
                st = new StringTokenizer(br.readLine());
                switch(st.nextToken()){
                    case "push_back":
                        deq.addLast(Integer.parseInt(st.nextToken()));
                        break;
                    case "push_front":
                        deq.addFirst(Integer.parseInt(st.nextToken()));
                        break;
                    case "size":
                        bw.write(deq.size()+"\n");
                        break;
                    case "empty":
                        if(deq.isEmpty()){
                            bw.write("1\n");
                        }else{
                            bw.write("0\n");
                        }
                        break;
                    case "front":
                        if(!deq.isEmpty()){
                            bw.write(deq.peekFirst()+"\n");
                        }else{
                            bw.write("-1\n");
                        }
                        break;
                    case "back":
                        if(!deq.isEmpty()){
                            bw.write(deq.peekLast()+"\n");
                        }else{
                            bw.write("-1\n");
                        }
                        break;
                    case "pop_front":
                        if(!deq.isEmpty()){
                            bw.write(deq.pollFirst()+"\n");
                        }else{
                            bw.write("-1\n");
                        }
                        break;
                    case "pop_back":
                        if(!deq.isEmpty()){
                            bw.write(deq.pollLast()+"\n");
                        }else{
                            bw.write("-1\n");
                        }
                        break;
                }
                bw.flush();
            }

        }
    }
}
