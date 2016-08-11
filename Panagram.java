package String;

import java.util.Scanner;

public class Panagram {
public static void main(String[] args) {
	Scanner scr=new Scanner(System.in);
	String s="abcdefghijklmnopqrstuvwxyz";
	char[] c=s.toCharArray();
	String s1=scr.nextLine();
	for(int i=0;i<s.length();i++)
	{
		if(!s1.contains(c[i]+""))
		{
			System.out.println(c[i]+"  is missing");
			System.exit(0);
		}
		
	}
	System.out.println("checked with no error");
}
}
