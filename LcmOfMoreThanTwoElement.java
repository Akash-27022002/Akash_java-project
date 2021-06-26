import java.util.Scanner;

public class LcmOfMoreThanTwoElement {
    static long gcd(long a,long b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
    static long findlcm(int arr[],int n){
        long ans = arr[0];
        for(int i=1;i<n;i++){
            ans=((arr[i]*ans)/gcd(arr[i],ans));
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.print("LCM of how many no. you want to find : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println ("Enter the "+n+" numbers whose lcm you want to find");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt ();
        }
        System.out.println(findlcm (arr,n));
    }
}
