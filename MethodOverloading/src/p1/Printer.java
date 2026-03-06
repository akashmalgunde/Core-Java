package p1;

public class Printer 
{
	void print()
	{
		System.out.println("normal print");
	}
	
	void print(int a)
	{
		System.out.println(a);
	}
	
	void print(double d)
	{
		System.out.println(d);
	}
	
	void print(int a,double d)
	{
		System.out.println(a+""+d);
	}
	
	void print(double d,int a)
	{
		System.out.println(d+""+a);
	}
	
	
}
