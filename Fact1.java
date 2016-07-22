package String;

import java.util.Scanner;

public class Fact {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	
	System.out.println(factorial(n));
}

private static int factorial(int n) {
	// TODO Auto-generated method stub
	if(n==0|n==1)
	{
		return 1;
	}
	else
	{
		return n*facto(n-1);
	}
}

}
