package assignment3;
import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			System.out.println("1. Science Fiction");
			System.out.println("2. Computers and Technology");
			System.out.println("3. Cooking");
			System.out.println("4. Business");
			System.out.println("5. Comics");
			System.out.println("6. Exit");
			
			System.out.println("Which category do you choose?");
			String input = sc.nextLine();
			int category = Integer.parseInt(input);
			
			if(category==1)
			{
				System.out.println("Science Fiction is a futuristic choice!");
			}
			else if (category==2)
			{
				System.out.println("Computers and Technolgy is a techy choice!");
			}
			else if (category==3)
			{
				System.out.println("Cooking is a delicious choice!");
			}
			else if (category==4)
			{
				System.out.println("Business is a smart choice!");
			}
			else if (category==5)
			{
				System.out.println("Comics is a nerdy choice!"); // Comic readers are not nerds!
			}
			else if (category==6)
			{
				System.out.println("Exiting the program.");
				break;
			}
			else
			{
				System.out.println("You selected an invalid number");
			}
			
			System.out.println();
			System.out.println();
		}
		
		sc.close();
	}
}
