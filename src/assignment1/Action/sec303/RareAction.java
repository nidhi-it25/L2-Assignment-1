package assignment1.Action.sec303;

/**
 * In this file you will provide the code solution for Part 2. You are required
 * to create a subclass named RareAction. Activities for RareAction occurs on a
 * particular date of the year specified.
 * 
 * @author Nidhi Patel
 * @version Version 1
 * @since 11.0.12
 */

public class RareAction extends Action {
	int year;
	int month;
	int day;

	/**
	 * Constructs an OccasionalAction with a description and day.
	 * 
	 * @param desc the text description of the action which pass to its super class
	 * @param y    when rare action happened year
	 * @param d    when rare action happened day
	 * @param m    when rare action happened month
	 *
	 */
	public RareAction(String desc, int y, int m, int d) {
		super(desc);
		this.year = y;
		this.month = m;
		this.day = d;
	}

	/**
	 * Override occursOn method with specific details based on Rare Action
	 * 
	 * @param y Year
	 * @param m month
	 * @param d day
	 * @return boolean value if action occur on that day
	 */
	@Override
	public boolean occursOn(int y, int m, int d) {
		return (d == day && m == month && y == year) ? true : false;
	}

}
