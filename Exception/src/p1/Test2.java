package p1;

import java.util.Scanner;

public class Test2 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int iAge = 0;
		
		System.out.println("Enter the age:");
		
		iAge = sc.nextInt();
		
		try
		{
			if(iAge < 18)
				throw new InvalidAgeException();
			
			else
				System.out.println("You are eligible for voting");
		}
		catch(InvalidAgeException ie)
		{
			System.out.println(ie);
			ie.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
