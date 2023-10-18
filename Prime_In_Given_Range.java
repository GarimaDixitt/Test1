import java.util.Scanner;

public class Prime_In_Given_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lower bound : ");
        int a = sc.nextInt();

        System.out.println("enter the upper bound : ");
        int b = sc.nextInt();

        int i, j, flag;
        for (i = a; i <= b; i++) {
            if (i == 0 || i == 1)
                continue;
            flag = 1;

            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.println(i);
            }

        }


    }
}