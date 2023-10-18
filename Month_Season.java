import java.util.Scanner;

public class Month_Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter thr month number :");
        int month = sc.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("enter month is  WINTER");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("enter month is  SPRING");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("enter month is  SUMMER");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("enter month is  AUTUMN");
                break;

            default:
                System.out.println("INVALID INPUT...");
        }

    }
}
