package powerball;
import java.util.Random;
import java.util.Scanner;
public class power {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		Random randGen = new Random();
	
		int dollars;

System.out.println("Enter amount of dollars:");
 dollars = scnr.nextInt();
 System.out.println(dollars + " dollars");
 
           int numb1;
           int numb2;
           int numb3;
           int numb4;
           int numb5;
           int numb6;
           
System.out.println("Your powerball numbers are:");
  numb1 = randGen.nextInt(60)+1;
  numb2 = randGen.nextInt(60)+1;
  numb3 = randGen.nextInt(60)+1;
  numb4 = randGen.nextInt(60)+1;
  numb5 = randGen.nextInt(60)+1;
  numb6 = randGen.nextInt(60)+1;
System.out.println(numb1+" "+numb2+" "+numb3+" "+numb4+" "+numb5+" "+numb6);	 
	 
	}
}
	

