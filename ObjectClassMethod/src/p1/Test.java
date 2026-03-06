package p1;

public class Test
{
	public static void main(String args[])
	{
		Object o = new Object();
		
		Object o1 = null;
	
		
		Employee e1 = new Employee(1,"Ram");
		
		Employee e2 = new Employee(2,"Ram");
		
		System.out.println(e1);
		
		System.out.println(e2);
		
		System.out.println(e1.equals(e2));
		
		System.out.println(e1.getClass());
		
		System.out.println(e1.hashCode());
		
		System.out.println(e2.hashCode());
	}
}
