import java.util.Scanner;

public class Digit_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        int a , sum = 0;
        while(n>0)
        {
            a = n %10;
            sum = sum + n;
            n = n/10;

        }
        System.out.println("sum of digit :" + sum);
    }
}
