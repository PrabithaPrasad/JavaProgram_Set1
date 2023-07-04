package multilevelinheritance2;

public class Birds extends Fish
{
	public void print2()
	{
		System.out.println("Birds can fly");
	}
	
	public static void main(String[] args) 
	{
		Birds s1 = new Birds();
		s1.print();
		s1.print1();
		s1.print2();
		
	}}


