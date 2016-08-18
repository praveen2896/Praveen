package String;

import java.util.Scanner;

public class StringD {
 public static void main(String[] args) {
	Scanner scr=new Scanner(System.in);
	String s=scr.nextLine();
	String l="";
	for(int i=0;i<s.length();i++)
	{ 
		String s1=s.charAt(i)+"";
     int count=s.replaceAll("[^"+s1+"]","").length();
     if(count>1)
     { if(!l.contains(s1))
    	 l+=s1;
    	 
     }
     else
     {
    	 l+=s1;
     }
	}
	System.out.println(l);
}
}
