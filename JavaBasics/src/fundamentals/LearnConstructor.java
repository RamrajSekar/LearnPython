package fundamentals;

public class LearnConstructor {

	LearnConstructor()
	{
		System.out.println("This is from constructor without args");
	}
	
	LearnConstructor(String a)
	{
		System.out.println("This is from constructor with args: "+a);
	}
	
	void a()
	{
		System.out.println("From non static block");
	}
	
	static void b()
	{
		System.out.println("From static block");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LearnConstructor lc = new LearnConstructor();
		LearnConstructor lc1 = new LearnConstructor("Ramraj");
		//To work with static and non-static block
		lc.a();
		b();
	}

}
