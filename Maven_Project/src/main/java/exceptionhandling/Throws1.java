package exceptionhandling;

import java.io.IOException;

public class Throws1 
{
	public void method1() throws IOException
	{
	throw new IOException("msg");
	}
	public void method2() throws IOException
	{
	this.method1();
	}
	public void method3()
	{
	try {
	this.method2();
	}
	catch (Exception e)
	{
	System.out.println("All cleared");
	}
	}

	public static void main(String[] args)
	{
	// TODO Auto-generated method stub

		Throws1 ok = new Throws1();
		ok.method3();
		System.out.println("All cleared in the program");
	}
}
