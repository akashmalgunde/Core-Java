package p1;

public class InvalidAgeException extends Exception
{
	public String toString()
	{
		return "Invalid age should be greater than 18";
	}
}	
