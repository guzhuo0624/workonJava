
/**
 * A representation of a Student
 * @author guzhuo
 *
 */
public class Student extends Person {
	
	// We don't have any child classes, so the modifier private seems
	// to be agood design choice.
	private String studentNumber;
	
	// This one doesn't really belong in this class. We included it here
	// to demonstrate what happens if we have instance variable with the
	// same name in the parent class and also in the child class.
	public String sameName;
	
	/**
	 * Create a new Student with the given name, date of birth, gender,
	 *  and student number.
	 *  @param name the name of the new Student
	 *  @param dob the date of birth of the new Student, in DDMMYYYY format
	 *  @param gender the gender of the new Student &mdash; M or F
	 *  @param studentNumber the student number of the new Student
	 */
	public Student(String [] name, String dob, 
			String gender, String studentNumber) {
		// calls the constructor in the parent class
			super(name, dob, gender);
			this.studentNumber = studentNumber;
			// see comment above about this variable
			this.sameName = "SameNameInStudent";
	}
	
	/**
	 * Returns a String representation of this Student.
	 */
	public String toString() {
		// calls the toString() method of the parent class
			String result = super.toString();
			return result + ", student number" + studentNumber;
	}
	
	public String strDob() {
		// needed to change dob to protected in parent class
	// to be able to access it here
		return "DOB is" + dob;
	}
}
