package String;

public class Reversedigits {
public static void main(String[] args) {
	int number=1234;
	int n;
	while(number>0)
	{
		n=number%10;
		System.out.print(n);
		number=number/10;
	}
}
}
