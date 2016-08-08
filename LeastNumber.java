package String;

import java.util.Scanner;

public class LeastNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		String num1=args[0];		
       int n=Integer.parseInt(num1);       
       int rem;
       int arr[]=new int[10];
       int temp;
       int i=0; 
       while(n>0)
       {    	   
    	   rem=n%10;
    	   arr[i]=rem;
    	   n=n/10;
    	   i++;    	   
       }       
       for( i=0;i<num1.length();i++)
       {    
    	   for(int j=i+1;j<num1.length();j++)
    	   {
    	   if(arr[i]>arr[j])
    	   {
    		   temp=arr[i];
    		  arr[i]=arr[j];
    		  arr[j]=temp;    		   
    	   }
    	   } 
    	   System.out.println(arr[i]);
       } 
       System.out.println("Enter the no of digits to delete");
       int k=s.nextInt();
       for(int j=0;j<num1.length()-k;j++)
       {
    	   System.out.print(arr[j]);
       }
       s.close();

	}

}

