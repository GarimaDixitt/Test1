//import java.util.Scanner;
//
//public class Palindrome {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number");
//        int n = sc.nextInt();
//        int r, sum=0,temp=0;
//
//        while(n>0)
//        {
//            r=n%10;
//            sum = (sum*10)+r;
//            n=n/10;
//        }
//
//        if(temp == sum)
//        {
//            System.out.println("palindrome ");
//        }
//        else {
//            System.out.println("not palindrome");
//        }
//    }
//}


//import java.util.Scanner;
//
//public class Palindrome {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the lower bound : ");
//        int a = sc.nextInt();
//
//        System.out.println("enter the upper bound : ");
//        int b = sc.nextInt();
//
//        int length ,i ,j, flag ;
//        for(i = a ;i<= b; i++)
//        {
//            if(i==0||i==1)
//                continue;
//            flag=1;
//
//            for(j=2; j<=i/2;j++)
//            {
//                if(i%j==0)
//                {
//                    flag=0;
//                    break;
//                }
//            }
//
//        }
//
