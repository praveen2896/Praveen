package Pay;

import java.util.Scanner;

public class Swiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scr=new Scanner(System.in);
     int n=scr.nextInt();
     String s="";
     
     for(int i=0;i<n;i++)
     {
    	 int a=scr.nextInt();
    	 int b=scr.nextInt();
    	 if(a!=0||b!=0)
    	 s+=(a*b)-1+" ";
    	 else
    	  s+=0;
     }
     System.out.println(s);
	}

}
