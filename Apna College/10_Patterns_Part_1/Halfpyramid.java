import java.util.Scanner;

public class Halfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the print of number of line:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }
            System.out.println();
        }
    }
}
