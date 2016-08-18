package String;

import java.util.Scanner;

public class Subset {
public static void main(String[] args) {
	Scanner scr=new Scanner(System.in); 
	int n1=scr.nextInt();
    int[] a1=new int[n1];
	String str="";
	String str2="";
	for(int i=0;i<n1;i++)
	{
		a1[i]=scr.nextInt();
		str+=a1[i]+"";
	}
	int n2=scr.nextInt();
	int[] a2=new int[n2];
	for(int i=0;i<n2;i++)
	{
		a2[i]=scr.nextInt();
		str2+=a2[i]+"";
	}
	if(str2.contains(str))
	{
		System.out.println("a1 is a subset of a2");
	}
	else
	{
		System.out.println("not subset");
	}
	
	
}
}
