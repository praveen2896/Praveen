package String;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	long n=s.nextLong();
	System.out.println(factorial(n));
}

private static long  factorial(long n) {
	if(n==0||n==1)
	{
		return 1;
	}
	else
	{
		return n*factorial(n-1);
	}
	
}
}
