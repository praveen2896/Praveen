package String;

import java.util.Scanner;

public class Stringp {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	StringBuffer sb=new StringBuffer(s1);
	String s2=sb.reverse()+"";
	System.out.println(s1);
	System.out.println(s2);
	if(s2.equals(s1))
	{
		System.out.println(s1.length()-1);
	}
	else
	{
		System.out.println(s1.length());
	}
	
}
}
