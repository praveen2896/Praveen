import java.util.*;
public class Power {
    public static void main(String ar[])
    {
       double input;
       Scanner sc=new Scanner(System.in);
       input=sc.nextDouble();

    	while(((input != 2) && input % 2 == 0) || input == 1) {
    	 input = input /2;
    	}

   if(input == 2)
   {
	   System.out.println("yes");
   }
   else
   {
	   System.out.println("no");
   }
   
}
}