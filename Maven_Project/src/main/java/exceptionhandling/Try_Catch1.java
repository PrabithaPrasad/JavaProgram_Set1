package exceptionhandling;

public class Try_Catch1 
{

	public void div()
	{
	int a=10;
	try // using try

	{
	int div=a/0;
	System.out.println("The division result is:");
	}
	catch(Exception e) // using catch
	{
	System.out.println("Exception Handled");
	}
	}
	public static void main(String[] args)
	{
	// TODO Auto-generated method stub
	Try_Catch1 ob=new Try_Catch1();
	ob.div();
	}
	
}
