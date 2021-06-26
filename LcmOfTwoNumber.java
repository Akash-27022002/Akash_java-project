
import java.util.Scanner;

public class LcmOfTwoNumber {
    static int Lcm(int a, int b){
        int lar=Math.max (a,b);
        int min=Math.min (a,b);
        for(int i=lar;;i+=lar){
            if(i%min==0)
                return i;
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the two number \na=");
        int a= sc.nextInt();
        System.out.print ("b=");
        int b= sc.nextInt();
        System.out.println("LCM of "+a+" and "+b+" is "+ Lcm(a,b) );
    }
}
