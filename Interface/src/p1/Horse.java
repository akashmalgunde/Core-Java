package p1;

public class Horse extends Animal implements Vehicle,Racer
{

	@Override
	public void racing() 
	{
		// TODO Auto-generated method stub
		System.out.println("Horse is running the race");
		
	}

	@Override
	public void travel() 
	{
		// TODO Auto-generated method stub
		System.out.println("Travelling done through the Horse");
	}

}
