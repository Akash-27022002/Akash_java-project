import java.io.*;
import java.util.*;

public class StringShortAccToMarks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] s=new String[n];
        int []id=new int[n];
        float []cg=new float[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            id[i]=sc.nextInt();
            s[i]=sc.next();
            cg[i]=sc.nextFloat();   
        }
        float d;
        String p;
        int t;
        for (i = 0; i < n-1; i++)
        {
            for (j = 0; j < n-i-1; j++)
            {
                if(cg[j+1]>cg[j])
                {
                    d=cg[j+1];
                    cg[j+1]=cg[j];
                    cg[j]=d;
                    p=s[j+1];
                    s[j+1]=s[j];
                    s[j]=p;
                    t=id[j+1];
                    id[j+1]=id[j];
                    id[j]=t;
                }
                if(cg[j]==cg[j+1])
                {
                    if(s[j+1].compareTo(s[j])<=0)
                    {
                        d=cg[j+1];
                        cg[j+1]=cg[j];
                        cg[j]=d;
                        p=s[j+1];
                        s[j+1]=s[j];
                        s[j]=p;
                        t=id[j+1];
                        id[j+1]=id[j];
                        id[j]=t;
                    }
                    
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
