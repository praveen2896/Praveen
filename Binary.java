package String;

import java.util.Scanner;

public class Binary {
		public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("enter the number of numbers");
		int n1=in.nextInt();
		int[] arr=new int[n1];
		int count[]=new int[n1];
		int temp1;
		for(int i=0;i<n1;i++)
		{
			arr[i]=in.nextInt();
		}
		in.close();
		for(int i=0;i<arr.length;i++)
		{  StringBuffer sb=new StringBuffer();
			int count1=0;
			int n=arr[i];
		   while(n>=1)
		{
			
		if(n%2!=0)
		{
		sb.append(1);
		}
		else if(n%2==0)
		{
		sb.append(0);
		}
		n=n/2;
		}
		String s=sb.reverse()+"";
		count1=s.replaceAll("[^1]","").length();
        count[i]=count1;
        sb=null;
		System.out.println(s+"  "+count1);
		}
		for(int i=0;i<count.length;i++)
		{
			System.out.println(count[i]);
		}
		int[] temp=new int[n1];
		for(int i=0;i<count.length;i++)
		{
			for(int j=i+1;j<count.length;j++)
			{
				if(count[i]<count[j])
				{   temp1=arr[j];
					arr[j]=arr[i];
					arr[i]=temp1;
				}
				
			}
		}
		for(int i=0;i<temp.length;i++)
			System.out.println(arr[i]);
		

}
}

