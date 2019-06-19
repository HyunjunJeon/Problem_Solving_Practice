import java.util.Scanner;

public class Problem2442 {
    private static void printStarShapePiramid(int i, int number){
        for(int j = 0; j < (number-1)-i; j++){
            System.out.print(" ");
        }
        for(int j = 0; j < 2*i+1; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i = 0; i < number; i++){
            printStarShapePiramid(i, number);
        }
        for(int i = number-2; i >= 0; i--){
            printStarShapePiramid(i, number);
        }
    }
}
