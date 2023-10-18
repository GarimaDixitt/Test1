
import java.util.Scanner;

public class Hollow_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of row :");
        int r = sc.nextInt();
        System.out.print("enter the number of column :");
        int c = sc.nextInt();
        int i, j;
        for (i = 1; i <= r; i++) {
            for (j = 1; j <= c; j++) {
                if (i == 1 || i == c || j == 1 || j == c) {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
                System.out.println();
            }
        sc.close();
    }
}