import java.util.Scanner;

public class Area_Of_Rectangle {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.println("enter the length : ");
            int l = sc.nextInt();
            System.out.println("enter the breath: ");
            int b = sc.nextInt();
            double area = 0;
            area = l * b;
            System.out.println("area of rectangle : "+area);
        }
    }

