package p1;

public class Date 
{
	int iDay;
	int iMonth;
	int iYear;
	
	public Date(int iDay,int iMonth,int iYear)
	{
		this.iDay = iDay;
		this.iMonth = iMonth;
		this.iYear = iYear;
	}
	
	public Date()
	{
		this.iDay = 1;
		this.iMonth = 1;
		this.iYear = 2025;
	}
	
	public String toString()
	{
		return this.iDay +" "+this.iMonth+" "+this.iYear+"";
	}
}
