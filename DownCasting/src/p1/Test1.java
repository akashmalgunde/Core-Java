package p1;

public class Test1
{
	public static void main(String args[])
	{
		Employee e = new SalesManagaer(1,"Ram",25000,2500);
		
		Employee e1 = new Admin(1,"Radha",15000,1000);
		
		getSalaryHike(e);
		
		getSalaryHike(e1);
		
	}

	private static void getSalaryHike(Employee e) {
		// TODO Auto-generated method stub
		
		if(e instanceof SalesManagaer)
		{
			SalesManagaer sm = (SalesManagaer)e;
			
			System.out.println(sm.calculateSalaryHike());
		}
		
		else if(e instanceof Admin)
		{
			Admin a = (Admin)e;
			
			System.out.println(a.calculateSalaryHike());
		}
	}
}
