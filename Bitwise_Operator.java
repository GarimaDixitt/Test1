import java.util.Scanner;

public class Bitwise_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter  ");
        a = a | b;
        b = a & b;
        a = b | a;
        System.out.println("");
    }
}
