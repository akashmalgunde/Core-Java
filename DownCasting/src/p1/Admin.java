package p1;

public class Admin extends Employee 
{
	int allowance;

	public Admin(int id, String name, int salary, int allowance) {
		super(id, name, salary);
		this.allowance = allowance;
	}
	
	
	int calculateSalaryHike()
	{
		return this.salary + this.allowance;
	}
	
}
