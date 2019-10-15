

public class Animal {
 public int numLegs=0;
 private int age=0;

 public void bark() {
	 System.out.println("hau hau");
 }
public void run() {
	System.out.println("Don't walk, run!!");
	
}
public static void main(String[] args) {
	Animal A = new Animal();
	A.bark();
    A.run();
    int a=A.numLegs;
    int b= A.age;
    
	}

}