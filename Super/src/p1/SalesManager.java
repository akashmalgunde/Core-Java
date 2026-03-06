package p1;

public class SalesManager extends Employee 
{
	int incentive;

	public SalesManager(int iId, String sName, int salary,int incentive) {
		super(iId, sName, salary);
		this.incentive = incentive;
	}

	@Override
	public String toString() {
		return super.toString()+"SalesManager [incentive=" + incentive + "]";
	}
	
	
	
	
}
