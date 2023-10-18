import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0 , b = 1 , i , c;
        System.out.println("fibonacci series of : ");
        int n = sc.nextInt();
        System.out.println("Fibonacci series till" + n +" terms is :");
        for(i=1;i<=n;i++)
        {
            System.out.println(a + " , ");
            c = a + b;
            a = b;
            b = c;
        }

    }
}


//import java.util.*;
//
//// Print the Fibonacci_Series upto the user input number
//
//public class Fibonacci_Series {
//    public static void main(String[] args) {
//        System.out.println("Enter the number upto you want your series");
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        int a=0;
//        int b=1;
//        int c;
//        System.out.print(a+","+b+",");
//        for(int i=0; i<n-2; i++){
//            c=a+b;
//            System.out.print(c+",");
//            a=b;
//            b=c;
//        }
//        sc.close();
//
//    }
//}