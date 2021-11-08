/**
 * Task.java
 * Represents tasks (such as ones that would appear on a to-do list), and is assigned priorities
 * @author Ethan Craycroft
 * @version 1.0
 * Polymorphism Project - Program 2
 * CS-131-ON Fall 2021
 */
public class Task implements Priority, Comparable<Task>
{
	public enum Status
	{
		NOT_STARTED, IN_PROCESS, COMPLETE; //possible values for the status of task objects
	}
	Status status; // status value for a task object
	String name = ""; // String used to identify a task object by its name
	int priority = 0; // integer used to set the priority of task objects
	
	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status)
	{
		this.status = status;
	}//end setStatus

	/**
	 * @return the status
	 */
	public Status getStatus()
	{
		return status;
	}//end getStatus

	/**
	 * @return the name
	 */
	public String getName() 
	{
		return name;
	}//end getName

	/**
	 * @param name the name to set
	 */
	public void setName(String name) 
	{
		this.name = name;
	}//end setName

	/**
	 * @return the priority
	 */
	public int getPriority() 
	{
		return priority;
	}//end getPriority

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) 
	{
		if(priority>=MIN_PRIORITY && priority <= MAX_PRIORITY)
		{
			this.priority = priority;
		}
	}//end setPriority
	
	@Override
	/**
	 * @param task the task to be compared against
	 */
	public int compareTo(Task task) 
	{
		if(this.getPriority() > task.getPriority())
		{
			return 1;
		}
		else if(this.getPriority() < task.getPriority())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}//end compareTo
	
	@Override
	public String toString() 
	{
		return "Task [name=" + name + ", priority=" + priority + "]";
	}//end toString
	
}//end class


	
	


