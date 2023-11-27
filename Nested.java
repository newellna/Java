package nested;
import java.util.Scanner;

public class Nested {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number between 1 and 10");
		String input = sc.nextLine();
		sc.close();
		
		
		
		int internalNumber = Integer.parseInt(input);
		int generatedNumber = (internalNumber/2);
		if(internalNumber>=1 && internalNumber<=10)
		{
			for(int i=1;i<=internalNumber;i++)
			{
				System.out.println("The outer loop value is: " + i);
				for (int j=1;j<=generatedNumber;j++)
				{
					System.out.println("The innner loop value is: " + j);
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("You enterned an invalid number");
		}
	}
}
