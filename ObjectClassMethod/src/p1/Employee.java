package p1;

public class Employee {
	int id;
	String name;
	
	public Employee(int id,String name)
	{
		this.id = id;
		this.name = name;
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
