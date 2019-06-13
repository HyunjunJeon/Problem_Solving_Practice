import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Problem10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        Stack<Integer> stack = new Stack<>();

        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            st = new StringTokenizer(sc.nextLine());
            String cli = st.nextToken();
            switch(cli){
                case "push":
                    int add = Integer.parseInt(st.nextToken());
                    stack.push(add);
                    break;
                case "top":
                    try{
                        sb.append(stack.peek()).append("\n");
                    }catch(Exception e){
                        sb.append(-1).append("\n");
                    }
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "pop":
                    try{
                        sb.append(stack.peek()).append("\n");
                        stack.pop();
                    }catch(Exception e){
                        sb.append(-1).append("\n");
                    }
                    break;
                case "empty":
                    if(stack.isEmpty()) {
                        sb.append(1).append("\n");
                    }else{
                        sb.append(0).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}
