public class Simple_Interest_Function {
    static double SI(int p,int r, int t){
        double i =(p*r*t)/100;
        return i;
    }

    public static void main(String[] args) {
        double Simple_Interest = SI(1000,6,10);
        System.out.println("this is simple interest :" +Simple_Interest);
    }
}
