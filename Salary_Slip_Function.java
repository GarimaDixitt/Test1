import java.util.Scanner;

public class Salary_Slip_Function {
    static float hra(float b){
        float hra;
        hra=b*(30/100);
        return(hra);
    }
    static float ta(float b){
        float ta;
        ta = b*(20/100);
        return(ta);
    }

    static float da(float b){
        float da;
        da= b*(10/100);
        return(da);
    }

    static float net(float b, float pf){
        float net;
        net=b+hra(b)+da(b)+ta(b)+pf;
        return net;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the basic salary :");
        float b= sc.nextFloat();
        System.out.println("enter the pf amount :");
        float pf = sc.nextFloat();
        System.out.println(net(b , pf));
        sc.close();
    }
}




//import java .util.*;
//
//// Salary slip of the employ including tax
//// Using Function
//
//public class Sallery_Slip_Function {
//    static float calculation(float s){
//        float HRA= (float) (s  * 0.3);
//        float DA= (float) (s * 0.2);
//        int TA= 2000;
//        float gross = s + HRA +DA +TA;
//        return gross ;
//    }
//    public static void main(String[] args) {
//        System.out.println("******Enter your details*****");
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter your Name: ");
//        String name = sc.next();
//        System.out.println("Enter your Salery in Rupees: ");
//        float salery =sc.nextFloat();
//        // function calling
//        float gross = calculation(salery);
//        float tax=0;
//        if(gross<=10000){
//            tax = 0;
//            float NEt1 =gross - tax;
//            System.out.println("Name: "+name);
//            System.out.println("Salery in Rupees: "+salery+" Rs");
//            System.out.println("Tax on the Salery :"+tax+" Rs");
//            System.out.println("THE gross of the person is :"+gross+" Rs");
//            System.out.println("The net salery person got: "+NEt1+" Rs");
//        }
//        else if(gross>10000 && gross<=20000){
//            tax =(float) (gross *0.05);
//            float NEt =gross - tax;
//            System.out.println("Name: "+name);
//            System.out.println("Salery in Rupees: "+salery+" Rs");
//            System.out.println("Tax on the Salery :"+tax+" Rs");
//            System.out.println("THE gross of the person is :"+gross+" Rs");
//            System.out.println("The net salery person got: "+NEt+" Rs");
//        }else if(gross>20000 && gross<=25000){
//            tax =(float) (gross *.15);
//            float NEt =gross - tax;
//            System.out.println("Name: "+name);
//            System.out.println("Salery in Rupees: "+salery+" Rs");
//            System.out.println("Tax on the Salery :"+tax+" Rs");
//            System.out.println("THE gross of the person is :"+gross+" Rs");
//            System.out.println("The net salery person got: "+NEt+" Rs");
//
//        }else{
//            tax =(float) (gross *.25);
//            float NEt =gross - tax;
//            System.out.println("Name: "+name);
//            System.out.println("Salery in Rupees: "+salery+" Rs");
//            System.out.println("Tax on the Salery :"+tax+" Rs");
//            System.out.println("THE gross of the person is :"+gross+" Rs");
//            System.out.println("The net salery person got: "+NEt+" Rs");
//        }
//        sc.close();
//
//    }
//}