package fundamentals;

public class LearnThisKey {

	String name;
	LearnThisKey(String name)
	{
		this.name = name;
	}
	void display()
	{
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LearnThisKey l1 = new LearnThisKey("Ramraj");
		l1.display();
	}

}
