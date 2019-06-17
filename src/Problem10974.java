import java.util.Scanner;

public class Problem10974 {
    // 1. 사용할 전역변수 정의
    private static int n = 0; // 여기까지 증가시켜줄 것 -> 입력 받음
    private static boolean[] used = new boolean[9]; // n은 최대 8까지
    private static int[] value = new int[9];

    // 2. 재귀호출될 함수 정의(순열 출력까지하는)
    private static void permutation(int position){
        if(position == n){ // 바닥조건, 0~n-1 까지의 position에 모든 숫자가 할당되었으므로 출력
            for(int i = 0; i < n; i++){
                System.out.print(value[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i = 1; i <=n; i++){
            // 해당 숫자가 사용되고 있다면 넘김
            if(used[i]) continue;
            // 사용되고 있지 않다면 value에 저장
            used[i] = true;
            value[position] = i;
            permutation(position+1);
            /*
                재귀호출이 완료되어 빠져나오면
                i에 대한 사용정보를 초기화 후 다음숫자로 넘어감
            */
            used[i] = false;
            value[position] = 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        permutation(0); // 0부터 입력된 n 까지 증가하면서
    }
}
