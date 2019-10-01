
package integer;
import java.util.Scanner;
public class sumOf3 {
	public static void main(String[] args) {
	  Scanner scrn = new Scanner(System.in);
		int numb1;
		int numb2;
		int numb3;
		int result;
		
		
	System.out.println("Welcome to this program");
	System.out.println("Enter first number:");
	  numb1 = scrn.nextInt();
	System.out.println("Enter second number");
	  numb2 = scrn.nextInt();
	System.out.println("Enter third number");
	  numb3 = scrn.nextInt();
	  result = (numb1 + numb2 + numb3);
    System.out.println("The sum is " + result);
     
	}

}
