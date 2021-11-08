import java.util.Random;

/**
 * Application1.java
 * Tests the Process and Task objects
 * @author Ethan Craycroft
 * @version 1.0
 * Polymorphism Project - Program 2
 * CS-131-ON Fall 2021
 */
public class ApplicationProcess extends Task
{
	
	public static void main(String[] args) 
	{
		Random random = new Random(); //random generator to create random priorities for process objects
		
		Process p1 = new Process(); //creating a process object p1
		p1.setProcessID("Process Example 1"); //setting the process ID for p1 with the setProcessID method
		p1.setPriority(random.nextInt(10)+1); //setting the priority for p1 with the setPriority method
		
		System.out.println("Process ID: " + p1.getProcessID() + "\nThe priority for " + p1.getProcessID() +" is: " + p1.getPriority()); //tests the getters for p1 object
		
		Process p2 = new Process(); //creating a process object p2
		p2.setProcessID("Process Example 2"); //setting the process ID for p2 with the setProcessID method
		p2.setPriority(random.nextInt(10)+1); //setting the priority for p2 with the setPriority method
		
		System.out.println("Process ID: " + p2.getProcessID() + "\nThe priority for " + p2.getProcessID() + " is: " + p2.getPriority()); //tests the getters for p2 object
		
		System.out.println("The result of the compareTo method is: "+ p1.compareTo(p2));
		//implements the compareTo method and displays the results
		
		if(p1.compareTo(p2) < 0)
		{
			System.out.println(p1.getProcessID() + " has a lower priority than " + p2.getProcessID() + ".");
		}
		else if(p1.compareTo(p2) > 0)
		{
			System.out.println(p1.getProcessID() + " has a higher priority than " + p2.getProcessID() + ".");
		}
		else if(p1.compareTo(p2) == 0)
		{
			System.out.println(p1.getProcessID() + " and " + p2.getProcessID() + " have equal priority.");
		}
		// if/else-if block uses compareTo method and relays information as to which process has the higher priority
		
	}//end body
	
}//end class
