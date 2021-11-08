/**
 * Process.java
 * Represents a process object (such as one that you might run on a computer) that will be assigned a priority
 * @author Ethan Craycroft
 * @version 1.0
 * Polymorphism Project - Program 2
 * CS-131-ON Fall 2021
 */
public class Process implements Priority, Comparable<Process>
{
	String processID = ""; //String used to identify process objects by their ID
	int priority = 0; //integer used to set the value of the process' priority
	
	/**
	 * @return the processID
	 */
	public String getProcessID() 
	{
		return processID;
	}//end getProcessID
	
	/**
	 * @param processID the processID to set
	 */
	public void setProcessID(String processID) 
	{
		this.processID = processID;
	}//end setProcessID
	
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
	 * @param process the process to be compared against
	 */
	public int compareTo(Process process) 
	{
		if(this.getPriority() < process.getPriority())
		{
			return -1;
		}
		else if(this.getPriority() > process.getPriority())
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}//end compareTo

	@Override
	public String toString() 
	{
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}//end toString

}//end class
