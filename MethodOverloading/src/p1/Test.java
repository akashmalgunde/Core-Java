package p1;

public class Test 
{
	public static void main(String args[])
	{
		Printer p1 = new Printer();
		
		p1.print();
		
		p1.print(20.5f);
		
		p1.print(10);
		
		p1.print(10,20.5);
		
		p1.print(20.5,10);
		
	}
}
