package p1;

public class Worker extends Thread
{
	public void run()
	{
		for(int i =1; i < 100; i++)
			System.out.print((char)i+" ");
	}
}
