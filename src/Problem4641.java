import java.util.Scanner;

public class Problem4641 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[101];
        int count = 0;
        int mcount = 0;
        do{
            a[count] = sc.nextInt();
            count++;
            if(sc.nextInt() == 0){
                int b = 0;
                for(int i = 0; i<a.length-1; i++){
                    b = a[i];
                    for(int j = i; j<(a.length-1)-i; j++){
                        if(2*b == a[j]){
                            mcount++;
                        }
                    }
                }
                count = 0;
                System.out.println(mcount);
                mcount = 0;
                sc.nextLine();
                continue;
            }
        }while(sc.nextInt() != -1);

    }
}
