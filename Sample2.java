package Sample;

import java.util.Scanner;

public class Sample2 {
public static void main(String[] args) {
	Scanner scr=new  Scanner(System.in);
	int k=scr.nextInt();
	int s=(int) Math.pow(2, k);
    System.out.println(s);
    for(int i=0;i<s;i++)
    {
    	System.out.println(Integer.toBinaryString(i));
    }
}
}
