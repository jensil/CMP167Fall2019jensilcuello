/**
 * 
 */

/**
 * @author jensi
 *
 */
public class AnimalTest {


	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.bark();
		System.out.println(dog.numLegs);
		dog.numLegs=6;
		System.out.println(dog.numLegs);
	}

}
