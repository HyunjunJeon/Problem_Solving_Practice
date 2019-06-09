import java.util.Scanner;

public class Problem10103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int round = sc.nextInt();
        // 주사위가 낮은 사람이 점수를 잃고 (100, 100에서 시작)
        // 주사위가 같은 수라면 0점을 잃음
        int chang = 100;
        int sang = 100;

        for(int i = 0; i < round; i++){
            int a = sc.nextInt(); int b = sc.nextInt();
            if(a < b){
                chang -= b;
            }else if(a == b){
                continue;
            }else{
                sang -= a;
            }
        }
        System.out.println(chang);
        System.out.println(sang);
    }
}
