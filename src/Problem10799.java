import java.util.Scanner;
import java.util.Stack;

public class Problem10799 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] strArr = str.toCharArray();

        Stack<Integer> st = new Stack<>();
        int size = strArr.length;
        int count = 0;

        for(int i = 0; i < size; i++){
            if(strArr[i] == '('){
                st.push(i);
            }else{
                if((st.peek()+1) == i){ // 1차이가 나면 레이저
                    st.pop();
                    count += st.size();
                }else{ // 쇠막대기니까 1만 더해주면됌(레이저2번이면 막대기 총 3개나오니까)
                    st.pop();
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
