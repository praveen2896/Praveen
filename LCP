import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class LCP {
    public static void main(String[] args)
    {
        Scanner scr=new Scanner(System.in);
        
        String s=scr.next();
        Set<String> a=new TreeSet();
        for(int i=0;i<s.length();i++)
        {
          String s1=s.substring(i,s.length());
            a.add(s1);
        }
         String[] arr=new String[a.size()];
        Iterator i=a.iterator();
        int d=0;
        while(i.hasNext())
        {     
            arr[d]=(String) i.next();
            d++;
        }
        for(int j=0;j<arr.length;j++)
        {
            System.out.println("quicksort.LCP.main()"+arr[j]);
                    
        }
        int[] lcp=new int[a.size()-1];
        int f=0;
        String temp="";
        for(int j=0;j<arr.length-1;j++)
        {   String s2=arr[j];
            String s3=arr[j+1];
           
              if(s3.startsWith(s2))
                { 
                   lcp[f]=s2.length();
                   System.out.println("quicksort.LCP.main()"+s2+"  "+s3+"  "+lcp[f]);
                   f++;
                }           
                 else
                {   
                    lcp[f]=0;
                    System.out.println("quicksort.LCP.main()"+s2+"  "+s3+"  "+lcp[f]);
                    f++;
                }
            }
         for(int j=0;j<lcp.length;j++)
        {
            System.out.println("quicksort.LCP.main()"+lcp[j]);
        }
       int[] arr1=new int[lcp.length];
       arr1=lcp.clone();
       Arrays.sort(lcp);
       int l=lcp[lcp.length-1];
       int index=0;
       for(int j=0;j<arr1.length;j++)
       {
           if(l==arr1[j])
               index=j;
       }
        System.out.println("quicksort.LCP.main()"+index);
        System.out.println("quicksort.LCP.main()"+arr[index]);
               
        
    }
            
}
