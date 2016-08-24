package Guvi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DAG {
public static void main(String[] args) {
	Scanner scr=new Scanner(System.in); 
	String s=scr.nextLine();//3/\94/\/\182/\/\/\4582
	ArrayList<Integer> al=new ArrayList<>();
	ArrayList<Integer> al2=new ArrayList<>();
	for(int i=0;i<s.length();i++)
	{
		if(Character.isDigit(s.charAt(i)))
		{
			al.add(Integer.parseInt(s.charAt(i)+""));
		}
		else
		{    System.out.println("else");
			for(int j=i;j<s.length();j++)
			{  System.out.println(s.charAt(j));
				if(!Character.isDigit(s.charAt(j)))
				{  
					if(al2.size()>1)
						break;
				}
				else
				{
					al2.add(Integer.parseInt(s.charAt(j)+""));
				}
				
			}  
			System.out.println(al2);
				/*else
				{   System.out.println(al);
				  if(al2.size()>=1){	
				al.add(check(al2));
					al2=null;
				  }
					break;*/
				}
			}
		}
	
	/*//int[] arr=new int[al.size()];
	int k=0;
	for(int i:al)
		arr[k++]=i;
	
	System.out.println(al);
}
public static int check(ArrayList<Integer> al3)
{  System.out.println(al3);
	int[] temp=new int[al3.size()];
   int k=0;
	for(int i:al3)
		temp[k++]=i;
	Arrays.sort(temp);
	for(int i=0;i<temp.length;i++)
	{
		System.out.println(temp[i]);
	}
	return 0;
		
}*/
}
