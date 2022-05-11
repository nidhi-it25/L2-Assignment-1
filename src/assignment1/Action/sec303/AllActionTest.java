package assignment1.Action.sec303;
import java.util.Scanner;

/**
 * In this file, you are required to write code for your part Part 3. The reason
 * for this class is to demonstrate the Action class and subclasses. You must
 * fill an array of action objects (hint: check the sample output file provided
 * for you) with different action activities. A user of this system should be
 * able to input a date of their choice and retrieve an output of all activities
 * that would occur on that date. You should reuse the Action class and
 * RegularAction classes from Part I of your solution and then the
 * OccasionalAction and RareAction classes from your Part 2.
 * 
 * @author Nidhi Patel
 * @version Version 1
 * @since 11.0.12
 */

public class AllActionTest {

	/**
	 * Start of Program for Part 3
	 * @param args to get input from user at run time
	 */
	public static void main(String[] args) {

		/**
		 * Creating Array of Action object class
		 */
		Action act[] = new Action[4];

		/**
		 * Initialize with different subclass of Action class.
		 */
		act[0] = new RegularAction("Wash your hands");
		act[1] = new OccasionalAction("Take a PCR Test", 1);
		act[2] = new RareAction("Get a booster shot", 2020, 12, 18);
		act[3] = new RegularAction("Sit two meters apart");

		/**
		 * initialize and create objcet for scanner class
		 */
		Scanner sc = new Scanner(System.in);

		/**
		 * Getting input from user in given format.
		 */
		System.out.println("Enter a date (like 2010 01 30): ");
		String string[] = sc.nextLine().split(" ");

		/**
		 * Printing action on particular date
		 */
		System.out.println("These are your actions on " + string[1] + "/" + string[2] + "/" + string[0]);

		/**
		 * loop through each action class and get event for each day and printing on
		 * console
		 */
		for (Action a : act) {
			if (a.occursOn(Integer.parseInt(string[0]), Integer.parseInt(string[1]), Integer.parseInt(string[2]))) {
				System.out.println(a.toString());
			}
		}
	}
}
