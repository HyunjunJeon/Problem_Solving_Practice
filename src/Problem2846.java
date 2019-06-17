import java.util.Scanner;
import java.util.Vector;

public class Problem2846 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> arr = new Vector<>();
        int prev, curr; int out = 0;

        int n = sc.nextInt();

        arr.add(sc.nextInt()); // 첫번째 값 무조건 In
        curr = arr.lastElement(); // 현재값을 첫번째값으로 조정

        while (n-- > 1){
            prev = curr; // 현재값을 뒤에 담고
            curr = sc.nextInt(); // 새로 들어온 값을 curr에 담음

            if(prev < curr){
                arr.add(curr);
            }else{ // 오르막이 끝나는 그 시점에
                if(!arr.isEmpty()){
                    out = Math.max(out, arr.lastElement() - arr.firstElement());
                }
                arr.clear(); // 비워버림, 새로운 오르막을 계산하기 위해서
                arr.add(curr); // 들어온 값을 꼭 넣어줘야함!!
            }
        }

        if(!arr.isEmpty()){
            System.out.print(Math.max(out, arr.lastElement() - arr.firstElement()));
        }else{
            System.out.println(out);
        }

    }
}
