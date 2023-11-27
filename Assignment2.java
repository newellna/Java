package assignment2;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in); // This will just ask user for Grade
		System.out.println ("Enter the grade from 0 to 100");
		String input = sc.nextLine ();
		
		sc.close();
		
		int grade = Integer.parseInt(input); // This converts users value into integer and put it into our value named "grade"
		
		if(grade>=90 && grade<=100)
		{
			System.out.println("You got an A grade");
		}
		else if (grade>=80 && grade<=89)
		{
			System.out.println("You got a B grade");
		}
		else if (grade>=70 && grade<=79)
		{
			System.out.println("You got a C grade");
		}
		else if (grade>=60 && grade<=69)
		{
			System.out.println("You got a D grade");
		}
		else if (grade>=0 && grade<=59)
		{
			System.out.println("You got a F grade");
		}
		else
		{
			System.out.println("You entered an invalid grade");
		}
	}
}