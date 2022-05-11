package assignment1.Action.sec303;

/**
 * This is code for Part 1. YOUR TASK is to create a subclass named
 * RegularAction. This is a subclass of the Action Superclass. Action has a
 * description (for example, "Wash your hands") and occurss on one or more
 * dates. A regularaction activity occurs every day.
 * 
 * @author Nidhi Patel
 * @version Version 1
 * @since 11.0.12
 */

public class RegularAction extends Action {

	/**
	 * Constructs an RegularAction with a description.
	 * 
	 * @param description the text description of the action which pass to its super
	 *                    class
	 */
	public RegularAction(String description) {
		super(description);
	}

	/**
	 * Override occursOn method with specific details based on regular action
	 * @param y Year
	 * @param m month
	 * @param d day
	 * @return boolean value if action occur on that day
	 */
	@Override
	public boolean occursOn(int y, int m, int d) {
		return (y != 0 && m != 0 && d != 0) ? true : false;
	}

}
