

package integer;
import java.util.Scanner;
public class substractionOf5 {


	public static void main(String[] args) {
	  Scanner scrn = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		int n4;
		int n5;
		int result;
		
		
	System.out.println("Welcome to this program");
	
	System.out.println("Enter first number:");
	  n1 = scrn.nextInt();
	
	System.out.println("Enter second number");
	  n2 = scrn.nextInt();
	
	System.out.println("Enter third number");
	  n3 = scrn.nextInt();

	System.out.println("Enter fourth number");
	  n4 = scrn.nextInt(); 
	
	System.out.println("Enter fifth number");
	  n5 = scrn.nextInt(); 
	
	  result = (n1 - n2 - n3 - n4 - n5);
    System.out.println("The sum is " + result);
     
	}

}
