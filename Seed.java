package String;

public class Seed {
public static void main(String[] args) {
	int a=123;
	int num;
	int mul=a;
	
	while(a>10)
	{
		num=a%10;
		mul*=num;
		a=a/10;
	}
	System.out.println(mul);
}
}
