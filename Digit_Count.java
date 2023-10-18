import java.util.Scanner;

public class Digit_Count {
    public static void main(String[] args) {
        int count = 0;
        int num;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number :");
        num = sc.nextInt();
        for(;num!=0;num/=10)
        {
            count++;
        }
            System.out.println("number of digit :"+count);
    }
}
