package com.company;
import java.util.Scanner;

public class GcdRecursiveAlgorithm {
    static int gcd(int x,int y){
        if(x==0) return y;
        if(y==0) return x;
        if(x==y) return x;
        if(x>y) return gcd (x-y,y);
        return gcd (x,y-x);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the two numberm \na=");
        int a= sc.nextInt();
        System.out.print ("b=");
        int b= sc.nextInt();
        System.out.println("GCD of "+a+" and "+b+" is "+ gcd(a,b) );

    }
}
