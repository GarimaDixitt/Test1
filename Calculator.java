import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int result;
        System.out.println("enter the first numbers : ");
        int a = sc.nextInt();
        System.out.println("enter the second numbers : ");
        int b = sc.nextInt();
        System.out.println("enter the operator : ");
        char ch = sc.next().charAt(0);

        switch(ch)
        {
            case'+':
                result = a + b;
                System.out.println( a+ "+" +b + " = " + result);
                break;

            case'-':
                result = a - b;
                System.out.println( a+ "-" +b +" = " + result);
                break;

            case'/':
                result = a / b;
                System.out.println( a+ "/" +b + " = " + result);
                break;

            case'*':
                result = a * b;
                System.out.println( a+ "*" +b + " = " + result);
                break;

            default:
                System.out.println("invalid operator");
                break;
        }
        sc.close();

    }
}

