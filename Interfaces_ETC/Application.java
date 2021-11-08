/**
 * Application.java
 * Used to test the modifications made to the RationalNumber class
 * Specifically tests the compareTo() method
 * @author Ethan Craycroft
 * @version 1.0
 * Polymorphism Project -- Program 1
 * CS-131-ON Fall 2021
 */

import java.util.Random;

public class Application 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Random random = new Random(); //Creating random generator to generate random integers for numerators and denominators of RationalNumber objects
		
		RationalNumber RN1 = new RationalNumber(random.nextInt(100), random.nextInt(100)); // Creating new RationalNumber object RN1 with a random numerator and denominator
	
		RationalNumber RN2 = new RationalNumber(random.nextInt(100), random.nextInt(100)); // Creating new RationalNumber object RN2 with random numerator and denominator
		
		System.out.println("Rational Number #1: " + RN1.getNumerator()+ "/" + RN1.getDenominator()); //Displaying RN1
		System.out.println("Rational Number #2: " + RN2.getNumerator()+ "/" + RN2.getDenominator()); //Displaying RN2
		
		System.out.println("Results of compareTo() method: " + RN1.compareTo(RN2)); //Displaying the results of the compareTo() method for clarity's sake - should print -1, 0, or 1
		
		if(RN1.compareTo(RN2) == -1)
		{
			System.out.println("Rational Number #1 is less than Rational Number #2");
		}//if compareTo method returns -1 that means the first rational number is less than the second rational number
		
		else if(RN1.compareTo(RN2) == 1)
		{
			System.out.println("Rational Number #1 is greater than Rational Number #2");
		}//if compareTo method returns 1 that means the first rational number is greater than the second rational number
		
		else if(RN1.compareTo(RN2) == 0)
		{
			System.out.println("Rational Number #1 is equal to Rational Number #2");
		}//if compareTo method returns 0 that means the first rational number is equal to the second rational number
		
	}//end body

}//end class
