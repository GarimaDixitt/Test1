import java.util.Scanner;

public class Plus_Pattern {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value: ");
        int n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i == n / 2 || j == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}