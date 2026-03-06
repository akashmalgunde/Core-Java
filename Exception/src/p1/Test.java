package p1;

public class Test 
{
	public static void main(String args[])
	{
		int iNo1 = 10;
		int iNo2 = 0;
		int iAns = 0;
		
		try
		{
			if(iNo2 != 0)
			{
				iAns = iNo1 / iNo2;
			}
			
			iAns = iNo1 / iNo2;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
			ae.printStackTrace();
		}
		
		System.out.println("After the try catch");
	}
}
