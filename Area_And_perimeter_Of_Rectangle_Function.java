
import java.util.Scanner;

public class Area_And_perimeter_Of_Rectangle_Function {
    static int perimeter(int x, int y){
        int c=0;
        c= 2*(x+y);
        return(c);
    }

//    static void area(int p, int q){
static int area(int p, int q){
        int d=0;
        d= p*q;
        return(d);
       // System.out.println("The Area Of Rectangle Is :"+d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length :");
        int a = sc.nextInt();
        System.out.print("Enter the breath :");
        int b = sc.nextInt();
        System.out.println("The Perimeter Of Rectangle Is :"+perimeter( a,b));

        System.out.println("The Area Of Rectangle Is :"+area( a,b));



    }
}


