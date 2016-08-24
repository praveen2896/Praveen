package Guvi;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	Scanner scr=new Scanner(System.in);
	String day=scr.nextLine();
	String year=scr.nextLine();
	int val=0;
	String[] s={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
	for(int i=0;i<s.length;i++)
	{
		if(s[i].equals(day))
		{
			val=i;
		}
        
	}
	if(val%2==1){
		for(int i=1;i<s.length;i=i+2)
		{
	      System.out.println(s[i]);		
		}
	}
	else if(val%2==0)
	{
		for(int i=0;i<s.length;i=i+2)
		{
			System.out.println(s[i]);
		}
			
	}
	if(year.equals("leap")){
		
	   if((val+1)%2==1)
		System.out.println(s[val+1]);
	
	}scr.close();
		
			
}
}
