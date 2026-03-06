package p1;

public class Employee {
	int id;
	String name;
	int salary;
	
	public Employee(int id,String name,int salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public boolean equals(Employee e)
	{
		if(this.id == e.id && this.name.equalsIgnoreCase(e.name))
			return true;
		else
			return false;
	}
	
	
	public String toString()
	{
		return "[Employee "+this.id+" "+this.name+"]";
	}

}
