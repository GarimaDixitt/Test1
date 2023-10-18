import java.util.Scanner;

public class Temperature_Converter {
    public static void main (String args[])
    {
        float Fahrenheit, Celsius;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the temperature in celsius : ");
        Celsius = sc.nextFloat();
        Fahrenheit =((Celsius*9)/5)+32;
        System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);
    }
}
