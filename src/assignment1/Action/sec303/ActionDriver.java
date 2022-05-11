package assignment1.Action.sec303;

import java.lang.reflect.Field;

/**
 * This is the ActionDriver class that will work as PART 1 of assignment. This
 * will check for super and subclass is correctly implemented. Also, check for
 * instance field and working of instance method
 * 
 * @author Nidhi Patel
 * @version Version 1
 * @since 11.0.12
 */

public class ActionDriver {

	/**
	 * Start of Program for Part 1
	 * @param args to get input from user at run time
	 */
	public static void main(String[] args) {

		/**
		 * Creating object of RegularAction class
		 */
		RegularAction regAc = new RegularAction("Wash your hands");

		/**
		 * Get number of field in RegularAction class
		 */
		Field[] regFields = RegularAction.class.getDeclaredFields();

		System.out.println("PART 1");

		/**
		 * Checking inheritance is properly structured or not with expected result Check
		 * number of instance variable in class Check sample output for toString method.
		 */
		System.out.print("RegularAction is just a subclass of Action: ");
		System.out.println(regAc instanceof Action);
		System.out.println("Expected: True");

		System.out.print("RegularAction activities have no extra fields: ");
		System.out.println(regFields.length == 0);
		System.out.println("Expected: True");

		System.out.println("Looking at regular actions: " + regAc.toString());
		System.out.println("Expected: " + regAc.toString());
		System.out.println(regAc.occursOn(2022, 5, 6));
		System.out.println("Expected: True");
	}

}
