package String;

import java.util.Scanner;

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str;
	        Scanner s=new Scanner(System.in);
	        str=s.nextLine();
	        char[] arr=str.toCharArray();
	        for(int i=0;i<str.length();i++)
	        {
	            for(int j=i+1;j<str.length();j++)
	            {
	            if(arr[i]==arr[j])
	            {
	               arr[j]=0; 
	            }
	        }
	    }
	        for(int i=0;i<str.length();i++)
	        { if(arr[i]!=0)
	        {
	            System.out.print(""+arr[i]);
	            }
	        }
	        s.close();

	}

}
