import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {

        int reversed = 0;
        System.out.println("enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}



//public class Reverse_Number {
//    public static void main(String[] args) {
//        System.out.println("Enter the number");
//        try(Scanner sc =new Scanner(System.in)){
//            int n=sc.nextInt();
//            int rev=0;
//            int r=0;
//            while(n > 0){
//                r = n % 10;
//                rev = rev*10 + r;
//                n = n / 10;
//            }
//            System.out.println("The Reverse number of digits  is:" +rev);
//        }
//    }
//}