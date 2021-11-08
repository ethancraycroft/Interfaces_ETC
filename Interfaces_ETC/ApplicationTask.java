import java.util.Random;

/**
 * ApplicationTask.java
 * Tests the Task object and its methods
 * @author Ethan Craycroft
 * @version 1.0
 * Polymorphism Project - Program 2
 * CS-131-ON Fall 2021
 */
public class ApplicationTask extends Task
{
	
	public static void main(String[] args) 
	{
		Random random = new Random();//random generator to create random priorities for task objects
		
		Task t1 = new Task(); //creating a task object t1
		t1.setName("Task Example 1"); //setting the name for t1 with the setName method
		t1.setPriority(random.nextInt(10)+1); //setting the priority for t1 with the setPriority method
		t1.setStatus(Status.NOT_STARTED); //setting the status of t1 with the setStatus method
		
		System.out.println("Task Name: " + t1.getName() + "\nThe priority for " + t1.getName() + " is: " + t1.getPriority() +"\nThe status for " + t1.getName() + " is: " + t1.getStatus());
		// tests all getters for t1 object
		
		Task t2 = new Task(); //creating a task object t2
		t2.setName("Task Example 2"); //setting the name for t2 with the setName method
		t2.setPriority(random.nextInt(10)+1); //setting the priority for t2 with the setPriority method
		t2.setStatus(Status.COMPLETE); //setting the status of t2 with the setStatus method
		
		System.out.println("Task Name: " + t2.getName() + "\nThe priority for " + t2.getName() + " is: " + t2.getPriority() +"\nThe status for " + t2.getName() + " is: " + t2.getStatus());
		// tests all getters for t2 object

		System.out.println("The result of the compareTo method is: "+ t1.compareTo(t2));
		//implements the compareTo method and displays the results
		
		if(t1.compareTo(t2) < 0)
		{
			System.out.println(t1.getName() + " has a lower priority than " + t2.getName() + ".");
		}
		else if(t1.compareTo(t2) > 0)
		{
			System.out.println(t1.getName() + " has a higher priority than " + t2.getName() + ".");
		}
		else if(t1.compareTo(t2) == 0)
		{
			System.out.println(t1.getName() + " and " + t2.getName() + " have equal priority.");
		}
		// if/else-if block uses compareTo method and relays information as to which process has the higher priority
		
	}//end body
	
}//end class