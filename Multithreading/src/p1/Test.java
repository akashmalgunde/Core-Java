package p1;

public class Test 
{
	public static void main(String args[])
	{
		Worker w1 = new Worker();
		
		w1.start();
		try {
			w1.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 1; i <= 100; i++)
			System.out.print(i+" ");
	}
}
