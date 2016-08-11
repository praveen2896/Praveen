package String;

import java.util.Scanner;

public class Square {
public static void main(String[] args) {
	Scanner scr=new Scanner(System.in);
	int n=scr.nextInt();
	int[] arr=new int[n];
	if(n%2==0)
	{
		for(int i=0;i<n;i++)
		{
			arr[i]=scr.nextInt();
	        		
		}
	}
	int count=0;
	for(int i=0;i<arr.length;i++)
	{ for(int j=0;j<arr.length;j++)
	{
		if(arr[i]==arr[j])
			count++;
	}
	if(count%2!=0){
		System.out.println("not a square");
	  System.exit(0);
	}
	scr.close();
  
	
	
} System.out.println("square");
}}
