package assignment1.Action.sec303;

/**
 * In this file you will provide the code solution for Part 2. You are required
 * to create a subclass named OccasionalAction. These are activities that occur
 * on the same day of every month specified.
 * 
 * @author Nidhi Patel
 * @version Version 1
 * @since 11.0.12
 */

public class OccasionalAction extends Action {

	int day;

	/**
	 * Constructs an OccasionalAction with a description and day.
	 * 
	 * @param description the text description of the action which pass to its super
	 *                    class
	 * @param day         is day on which action happen.
	 */
	public OccasionalAction(String description, int day) {
		super(description);
		this.day = day;
	}

	/**
	 * Override occursOn method with specific details based on Occasional Action
	 * 
	 * @param y Year
	 * @param m month
	 * @param d day
	 * @return boolean value if action occur on that day
	 */
	@Override
	public boolean occursOn(int y, int m, int d) {
		return d == day ? true : false;
	}

}
