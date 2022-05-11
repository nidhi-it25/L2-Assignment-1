package assignment1.Action.sec303;

/**
 * This is the Action Superclass class that provides a catalog of actions to be
 * carried out in view of COVID-19 OPH protocols. You are required to complete
 * read and review this code to appropriately fill the required loopholes.
 * 
 * @author Nidhi Patel
 * @version Version 1
 * @since 11.0.12
 */

public abstract class Action {

	private String description;

	/**
	 * Constructs an action without a description.
	 */
	public Action() {
		description = "";
	}

	/**
	 * Constructs an action with a description.
	 * @param desc the text description of the action
	 */
	public Action(String desc) {
		description = desc;
	}

	/**
	 * Sets the description of this action.
	 * @param description the text description of the action
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Determines if this action occurs on the specified date. This is abstract
	 * method as it does not have definition defined
	 * @param y the year
	 * @param m the month
	 * @param d the day
	 * @return true if the action activity occurs on the specified date.
	 */
	public abstract boolean occursOn(int y, int m, int d);

	/**
	 * Converts action activity to string description.
	 */
	public String toString() {
		return description;
	}
}
