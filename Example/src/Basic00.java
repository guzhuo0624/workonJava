
import java.util.ArrayList;

/**
 * Demonstrates basic concepts in Java 00.
 * @author guzhuo
 *
 */
public class Basic00 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//demoArrays();
		
		String [] anyasName = {"Anya", "T"};
		Person anya = new Person(anyasName, "01011980", "F");
		// cannot access name: it is private
		//System.out.println(anya.name);
		// calls method toString() defined in Person
		System.out.println(anya.toString());
		// calls method getDob() defined in Person
		System.out.println(anya.getDob());
		
		String [] bobsName = {"Bob", "B", "Bobson"};
		Student bob = new Student(bobsName, "01011991", "M", "01234");
		// calls method toString() defined in Student
		System.out.println(bob.toString());
		// How does it know which toString() to call? It knows bob is
		// a Student, and there is a method toString() defined in
		// Student, so this method is called. We say that Student
		// OVERRIDES the method toString().
		System.out.println(bob.getDob()); // calls method getDob()
										  // defined in Person
		// How does it know to do this? WEll, Student does not
		// override getDob(). So, it doesn't find getDob() in Student,
		// so it looks in the parent class. It finds it here, so
		// that's the one that gets called.
		
		// Polymorphism!!! Yay!!!
		Person [] people = new Person [2]; // an Array of two Persons
		people[0] = anya;
		people[1] = bob;
		for (Person person: people) {
			// calls toString() of the corresponding object
			System.out.println(person.toString());
		}
		
		// What happens if we have an instance variable in a parent
		// class and an instance variable with the same name in the
		// child class? Let's see.
		System.out.println(bob.sameName); // it gets the one defined
					  // in Student, since Bob is
					  // a student
		// gets the one defined in Person
		System.out.println(((Person) bob).sameName);
		// called casting: treat bob as Person for this one task
		// legal because Student is a subclass of Person, so every
		// Student IS A Person.
		
		// now suppose we change the Array anyasNmae (recall that we
		// used it to create the object anya of type Person)
		anyasName[0] = "Surprise!";
		System.out.println(anya.toString()); // major UPS!
	}
	
		/**
		 * Shows some Arrays and for loops
		 */
		public static void demoArrays() {
			
			//declare an Array of ints intArray
			//create a new Array with room for 5 ints (init to 0s)
			//assign the newly created Array to intArray
			int [] intArray = new int [5];
			intArray[2] = 42; //set the third element to 42
			// an Array stores its length
			// cannot grow or shrink Arrays (not like in Python)
			for (int i=0; i < intArray.length; i++) {
				System.out.print(intArray[i] + " ");
			}
			System.out.println();
			
			// an Array of three Strings, shortcut form to init
			String [] strArray = {"one", "two", "three"};
			for (int i=0; i < strArray.length; i++) {
				System.out.print(strArray[i] + " ");
			}
			System.out.println();
			
			// a different for-loop, uses an iterator like a Python for-loop
			for (String str : strArray) {
				System.out.print(str + " ");
			}
			System.out.println();
			
			// so how come this works? autoboxing!!!
			for (Integer i: intArray) {
				System.out.print(i + " ");
			}
		}
}
