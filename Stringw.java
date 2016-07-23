package String;

import java.util.Scanner;

public class Stringw {
public static void main(String[] args) {
	Scanner scr=new Scanner(System.in);
	String str=scr.nextLine();
	String[] str1=str.split("");
	String s="";
	for(int i=str1.length-1;i>=0;i--)
	{
		s+=str1[i]+"";

		
	}
	System.out.println(s);
	
			
}
}
