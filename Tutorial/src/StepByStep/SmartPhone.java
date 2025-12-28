package StepByStep;

public abstract class SmartPhone {

	/*
	 * 4 Go back to your SmartPhone class definition. Change the line String os; to
	 * be private String os;
	 */

	private String os;

	/*
	 * 1 Can you try writing the code for the SmartPhone constructor? It needs to:
	 * 
	 * Be named SmartPhone.
	 * 
	 * Accept a String variable inside the parentheses () (let's call it inputOS).
	 * 
	 * Inside the curly braces {}, assign that input to our class field OS.
	 */

	public SmartPhone(String inputOS) {

		os = inputOS;

	}

	/*
	 * 5 Can you write a new method inside your class called getOS?
	 * 
	 * It must be public (so others can use it).
	 * 
	 * It must return a String.
	 * 
	 * Inside, it simply returns the os variable.
	 */

	public String getOS() {
		return os;
	}

	/*
	 * 7 Can you write a method named setOS inside the SmartPhone class that allows
	 * us to update the os variable to a new string?
	 */

	public void setOS(String osVersion) {
		os = osVersion;
	}

	/*
	 * 2 Can you write the Java code for the main method that creates two distinct
	 * phone objects:
	 * 
	 * A phone named phone1 that passes in "Android".
	 * 
	 * A phone named phone2 that passes in "iOS".
	 */
	
	public void screenLock() {
		System.out.println("Screen is Locked");
	}
	
	public void screenUnlock() {
		System.out.println("Screen is Unlocked");
	}

	public static void main(String[] args) {
		SmartPhone phone1 = new Android("Android 15");
		SmartPhone phone2 = new Android("IOS");

		/*
		 * 3 Using the dot operator . (which acts like a key to open the object), can
		 * you write a line of code inside main to print the OS of phone1 to the
		 * console?
		 */

		/*
		 * 6 Update your main method to print the OS using the getter method instead of
		 * the variable directly.
		 */
		System.out.println(phone1.getOS());

	}

}
