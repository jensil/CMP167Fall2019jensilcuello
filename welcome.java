package week1;
import java.util.Scanner;
public class welcome {
	public static void main (String[] args){
		String welcome = "Welcome to Java";
	System.out.println(welcome);
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("What is your name? I'm a program");
	
	String name=input.nextLine();
	
	System.out.println("Nice to meet you, "+name);
	}

}
