package review;

public class Child1 extends Parent
{
	public void display()
	{
		super.display();
		System.out.println("This Child Class");
	}

	public static void main(String[] args) 
	{
		Child1 s = new Child1();
		s.display();
		//s.display();
	}

}
