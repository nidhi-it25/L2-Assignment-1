package assignment1.Action.sec303;

import java.lang.reflect.Field;

/**
 * This is the ActionDriver2 class that will work as PART 2 of assignment. This
 * will check for super and subclass is correctly implemented. Also, check for
 * instance field and working of instance method
 * 
 * @author Nidhi Patel
 * @version Version 1
 * @since 11.0.12
 */

public class ActionDriver2 {

	/**
	 * Start of Program for Part 2
	 * @param args to get input from user at run time
	 */
	public static void main(String[] args) {

		/**
		 * Creating object of OccasionalAction, RareAction class
		 */
		OccasionalAction occAc = new OccasionalAction("Take a PCR Test", 1);
		RareAction rarAc = new RareAction("Get a booster shot", 2021, 12, 18);

		/**
		 * Get number of field in RegularAction class
		 */
		Field[] occFields = OccasionalAction.class.getDeclaredFields();
		Field[] rarFields = RareAction.class.getDeclaredFields();

		System.out.println("PART 2");

		/**
		 * Checking inheritance is properly structured or not with expected result Check
		 * number of instance variable in class Check sample output for toString method.
		 */
		System.out.print("OccasionalAction is subclass of Action:");
		System.out.println(occAc instanceof Action);
		System.out.println("Expected: True");

		System.out.print("RareAction is subclass of Action:");
		System.out.println(rarAc instanceof Action);
		System.out.println("Expected: True");

		System.out.print("OccasionalAction have no extra fields:");
		System.out.println(occFields.length == 0);
		System.out.println("Expected: False");

		System.out.print("RareAction have no extra fields:");
		System.out.println(rarFields.length == 0);
		System.out.println("Expected: False");

	}

}
