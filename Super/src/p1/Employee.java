package p1;

public class Employee 
{
	int iId;
	String sName;
	int salary;
	public Employee(int iId, String sName, int salary) {
		super();
		this.iId = iId;
		this.sName = sName;
		this.salary = salary;
	}
	
	public Employee() {
		//super();
		this.iId = 1;
		this.sName = "Sandesh";
		this.salary = 25000;
	
}

	@Override
	public String toString() {
		return "Employee [iId=" + iId + ", sName=" + sName + ", salary=" + salary + "]";
	}
	
	
}
