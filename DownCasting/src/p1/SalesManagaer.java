package p1;

public class SalesManagaer extends Employee 
{
	
	int iIncentive;
	
	 SalesManagaer(int id,String name,int salary,int incentive)
	{
		super(id,name,salary);
		this.iIncentive = incentive;
	}
	 
	 int calculateSalaryHike()
	 {
		 return this.salary + this.iIncentive;
	 }
}
