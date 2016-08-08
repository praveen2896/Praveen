package String;

import java.util.Scanner;

public class Tower {
	

		   public void Answer(int n, String start, String auxiliary, String end) {
		       if (n == 1) {
		           System.out.println(start + " - " + end);
		       } else {
		           Answer(n - 1, start, end, auxiliary);
		           System.out.println(start + " -> " + end);
		           Answer(n - 1, auxiliary, start, end);
		       }
		   }

		   public static void main(String[] args) {
		       Tower towers = new Tower();
		       System.out.print("Enter number of discs: ");
		       Scanner s = new Scanner(System.in);
		       int discs = s.nextInt();
		       towers.Answer(discs, "A", "B", "C");
		   }
		}

