
import java.util.Arrays;

/**
 * A representation of a person
 * @author guzhuo
 *
 */
public class Person {
	// We had them private, which made them invisible outside of this class.
	// When we introduced the subclass Student, we realized we ant to have it
	// visible in the child classes, but still invisible everywhere else,
	// so we use the modifier protected.
	protected String [] name;
		protected String dob;	//	format DDMMYY
		protected String gender; //	must be M of F
		
		// This one doesn't really belong in this class. We included it here
		// to demonstrate what happens if we have instance variables with the 
		// same name in the parent class and also in the child class.
		public String sameName;
		
		/**
		 * Create a Person with the given name, date of birth, and gender.
		 * @param name name f the new Person
		 * @param dob date of birth of the new Person, in DDMMYYYY format
		 * @param gender gender of the new Person, M or F
		 */
		public Person(String [] name, String dob, String gender) {
			this.name = name; // what is the problem? how do we fix it?
			this.dob = dob;
			this.gender = gender;
			// see comment above about this variable
			this.sameName = "SameNameInPerson";
		}

		public String[] getName() {
			return name;
		}

		public void setName(String[] name) {
			this.name = name;
		}

		public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}
		
		/**
		 * Returns a String representation of this Person
		 */
		
		public String toString() {
			String strName = Arrays.toString(name);// we will see how this works next time
			String result = strName + ", " + dob + "(DDMMYYYY)";
			if (gender.equals("M")) {
				result += ", Male";
			} else {
				result += ",Female";
			}
			return result;
		}
}