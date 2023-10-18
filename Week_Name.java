import java.util.Scanner;

public class Week_Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter thr weekday number :");
        int daynumber = sc.nextInt();

        switch(daynumber)
        {
            case 1:
                System.out.println("SUNDAY");
                System.out.println("Weekend");
                break;

            case 2:
                System.out.println("MONDAY");
                System.out.println("Weekend");
                break;

            case 3:
                System.out.println("TUESDAY");
                System.out.println("Weekend");
                break;

            case 4:
                System.out.println("WEDNESDAY");
                System.out.println("Weekend");
                break;

            case 5:
                System.out.println("THURSDAY");
                System.out.println("Weekend");
                break;


            case 6:
                System.out.println("FRIDAY");
                System.out.println("Weekend");
                break;

            case 7:
                System.out.println("SATURDAY");
                System.out.println("Weekend");
                break;

            default:
                System.out.println("INVALID INPUT...");
                break;
        }

    }
}
