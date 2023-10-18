import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n,i;
        System.out.println("enter the number : ");
        n = sc.nextInt();
        for(i = 2; i<=n/2;i++)
            if(n%i==0) {
                System.out.println("number is prime");
                break;
            }
        else
        {
            System.out.println("number is  not prime");
        }

    }
}
