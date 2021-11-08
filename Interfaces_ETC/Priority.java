/**
 * Priorty.java
 * This interface sets the min, med, and max values for priority to be used by Task and Process objects
 * Has methods for setting and getting priority - to be implemented in Task and Process classes
 * @author Ethan Craycroft
 * @version 1.0
 * Polymorphism Project - Program 2
 * CS-131-ON Fall 2021
 */
public interface Priority 
{
	final int MED_PRIORITY = 5; //integer sets the median value for priority
	final int MAX_PRIORITY = 10; //integer sets the maximum value for priority
	final int MIN_PRIORITY = 1; //integer sets the minimum value for priority
	
	public void setPriority(int priority);
	
	public int getPriority();
	
}//end interface
