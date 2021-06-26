import java.util.Scanner;

public class GcdEncludeanAlgorithm {
    int gcd(int x, int y){
        if(y==0) return x;
        return gcd (y,x%y);
    }
    public static void main(String[] args){
        GcdEncludeanAlgorithm x =new  GcdEncludeanAlgorithm();
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the two numberm \na=");
        int a= sc.nextInt();
        System.out.print ("b=");
        int b= sc.nextInt();
        System.out.println("GCD of "+a+" and "+b+" is "+ x.gcd(a,b) );

    }
}
