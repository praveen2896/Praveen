package Sample;

import java.util.Scanner;

public class Least {
public static void main(String[] args) {
Scanner sr=new Scanner(System.in);
String num=sr.nextLine();;
int k=sr.nextInt();
int[] arr=new int[num.length()];
for(int i=0;i<num.length();i++)
{
	arr[i]=Integer.parseInt(num.charAt(i)+"");
}
int temp;
for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]>arr[j])
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}

String s1="";
for(int i=0;i<k-1;i++)
{
	s1+=arr[i]+"";
}
System.out.println(s1);

}
}
