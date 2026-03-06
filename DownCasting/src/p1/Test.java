package p1;

public class Test 
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
		SalesManagaer s = (SalesManagaer)e;
		
		System.out.println(s.calculateSalaryHike());
	}
}
