package Guvi;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Prime {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	Set<Integer> al3=new TreeSet<>();
	ArrayList<Integer> al2=new ArrayList<>();
	for(int i=2;i<=100;i++)
	{ int count=0;
		for(int j=2;j<=i/2;j++)
		{
			if(i%j==0)
				count++;
		}
		if(count==0)
			al.add(i);
	}
	for(int i=0;i<al.size();i++)
	{
		int n=al.get(i);
		if(n>10)
		{  int sum=0;
			while(n>0)
			{
				int temp=n%10;
				sum+=temp;
				n=n/10;
			}
		  if(check(sum)==1)
			  al2.add(sum);
		}
		else
		{
			al2.add(al.get(i));
		}
	}
	//System.out.println(al);
	//System.out.println(al2);
	int[] arr=new int[al2.size()];
	int k=0;
	for(int y:al2)
      arr[k++]=y;
	System.out.println("sum of primenumbers which is also prime are");
	for(int y:al2)
		System.out.println(y);
	
	for(int i=0;i<al2.size();i++)
	{  int t=arr[i];
	  int  count1=1;
		for(int j=0;j<al2.size();j++)
		{
			if(t==arr[j])
			  count1++;	
		}
		if(count1>2)
			al3.add(t);
	}
	System.out.println("sum which is repeated");
    for(int y:al3)
    	System.out.println(y);
}
public static int check(int m)
{  int c=0;
	for(int i=2;i<=m/2;i++)
	{
		if(m%i==0)
		  c++;
	}
	if(c==0)
		return 1;
	else
		return 0;
}
}
