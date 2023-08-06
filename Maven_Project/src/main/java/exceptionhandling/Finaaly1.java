package exceptionhandling;

public class Finaaly1 
{

	public void div()
	{
	int a=10;
	try
	{
	int div=a/0;
	System.out.println("The division result is:");
	}
	catch(Exception e)
	{
	System.out.println("Exception Handled");
	}
	finally // finally block
	{
	System.out.println("Final block handled");
	}
	}
	public static void main(String[] args)
	{
	// TODO Auto-generated method stub
		Finaaly1 ob=new Finaaly1();
	ob.div();
	}
	
}
