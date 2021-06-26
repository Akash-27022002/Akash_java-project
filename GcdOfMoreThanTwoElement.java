import java.util.Scanner;
public class GcdOfMoreThanTwoElement {
    static int gdc(int a ,int b){
        if(a==0) return b;
        return gdc(b%a,a);
    }
    static int Findgdc(int arr[]){
        int result =0;
        for(int x:arr) {
            result = gdc (result, x);
            if (result == 1)
                return 1;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.print ("GDC of how many elements you want to found :");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println ("Enter the "+n+" numbers whose GDC you want to find");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt ();
        System.out.println("GDC of these numbers is "+ Findgdc(arr));

    }
}
