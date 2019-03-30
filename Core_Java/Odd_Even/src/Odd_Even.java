import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		
		      int x;
		      System.out.println("Enter an integer to check if it is odd or even");
		      Scanner in = new Scanner(System.in);
		      x = in.nextInt();
		     
		      if (x % 2 == 0)
		         System.out.println("The number is even.");
		      else
		         System.out.println("The number is odd.");
		      
		      System.out.println("\n");
		      
		      //odd_even numbers from 1 to N
		      
		      System.out.println("The Odd Numbers are:");
				for (int i = 1; i <= 50; i++) {
					if (i % 2 != 0) {
						System.out.print(i + " ");
					}
					
				}
				System.out.println("\n");
				System.out.println("The Even Numbers are:");
				for (int i = 1; i <= 50; i++) {
					if (i % 2 == 0) {
						System.out.print(i + " ");
					}
					
				}
		   }
		

}
