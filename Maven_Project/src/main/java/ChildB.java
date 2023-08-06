
public class ChildB implements Parent1, Parent2
{
	public void name()
	{
		System.out.println("Prabitha");
	}
	
	public void ID()
	{
		System.out.println("908");
		
	}
	public static void main(String[] args) 
	{
		ChildB p = new ChildB();
		p.name();
		p.ID();
	}

}
