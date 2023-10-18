import java.util.Scanner;

public class Solid_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row and column :");
        int n = sc.nextInt();
        int i, j;
        for (i = 0; i <=n; i++) {
            for (j = 0; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
