package String;

import java.util.Scanner;

public class Node {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	int len=arr.length/2;
	int len1=arr.length-len;
	int count1=0;
	int count2=0;
	for(int i=0;i<len;i++)
	{
		count1+=arr[i];
	}
	for(int i=0;i<len1;i++)
	{
		count2+=arr[i];
	}
	if(count1/len==count2/len1)
	{
		System.out.println("possible");
	}
	else
	{
		System.out.println("not possible");
	}
	sc.close();
}
}
