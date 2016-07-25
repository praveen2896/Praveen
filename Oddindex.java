package String;

public class Oddindex {
public static void main(String[] args) {
	String s="this is an example of program";
	odd(s);
}

private static void odd(String s) {
	// TODO Auto-generated method stub
	String[] str=s.split(" ");
	System.out.println(str[0]);
	StringBuffer[] a=new StringBuffer[str.length];
	StringBuffer ab=new StringBuffer();
	for(int i=0;i<str.length;i++)
	{
		System.out.println(i%2);
		if(i%2==0)
		{System.out.println(str[i]);
		ab.append(new StringBuffer(str[i]).reverse());
	
		ab.append(' ');
		System.out.println(ab);}
		else{
			ab.append(str[i]);
			
			ab.append(' ');
			System.out.println(ab);}
	      
	}
	System.out.println(ab);
}
}
