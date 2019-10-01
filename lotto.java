package megamillion;
import java.util.Scanner;
public class lotto {
  public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	//new thing to use  instead of scanner is 22
	//Random randGen = new Random();
	//System.out.println(randGen.nextInt();
	//int rnum1=randGen.nextInt(60) + 1; the 1 makes the pc to use any number except 0
	/* 1-declare variable to hold amount of dollar
	 * 2-declare variable for cost of ticket
	 * 3-prompt user for amount of dollars
	 * 4-store amount into amount of dollar variable
	 * 5-ask to input 6 numbers
	 * 6-create variable for each number
	 * 7-randomly generate six number
	 */
	 
	  int Dollars;
	  int firstnumber;
	  int secondnumber;
	  int thirdnumber;
	  int fourthnumber;
	  int fithnumber;
	  int lastnumber;
	   
System.out.println("Enter the amount of dollars you want to play: ");
  Dollars = scnr.nextInt();
System.out.println("Enter six numbers: ");
  System.out.println("First number:");
    firstnumber = scnr.nextInt();
  System.out.println("second number:");
    secondnumber = scnr.nextInt();
  System.out.println("Thrid number:");
    thirdnumber = scnr.nextInt();
  System.out.println("Fourth number:");
    fourthnumber = scnr.nextInt();
  System.out.println("Fith number:");
    fithnumber = scnr.nextInt();
  System.out.println("six number:");
    lastnumber = scnr.nextInt();
System.out.println("Your Mega Million numbers are:");
System.out.println(firstnumber + " " + secondnumber + " " + thirdnumber + " " + fourthnumber + " " + fithnumber + " " + lastnumber);;


  
  }
}
