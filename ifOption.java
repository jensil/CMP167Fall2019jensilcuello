
package powerballmodification;

import java.util.Random;
import java.util.Scanner;
public class ifOption {

	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		Random randGen = new Random();
	
		int dollars;
		int winningNumbers = 246918;
System.out.println("Enter amount of dollars:");
 dollars = scnr.nextInt();
 System.out.println(dollars + " dollars");
 
           int numb1;
           int numb2;
           int numb3;
           int numb4;
           int numb5;
           int numb6;
           int numbers;
System.out.println("Your powerball numbers are:");
  numb1 = randGen.nextInt(60)+1;
  numb2 = randGen.nextInt(60)+1;
  numb3 = randGen.nextInt(60)+1;
  numb4 = randGen.nextInt(60)+1;
  numb5 = randGen.nextInt(60)+1;
  numb6 = randGen.nextInt(60)+1;
System.out.println(numb1+" "+numb2+" "+numb3+" "+numb4+" "+numb5+" "+numb6);	 
	 
  numbers = numb1 +numb2 +numb3 + numb4 + numb5 + numb6;
	if (numbers == winningNumbers) {
		System.out.println("Congratulation you won the powerball!!!!");
	} else {
		System.out.println("Better luck next time");
	}
	
	}
}
	

