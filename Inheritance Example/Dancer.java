package lecture2;

public class Dancer extends Person{
	private String groupName;
	public Dancer()
	{
		super();
		this.groupName = "Dance group";
	}
	
	public Dancer(String name, String groupName)
	{
		super(name);
		this.groupName = groupName;
	}
	
	public Dancer(String name, String designation, String groupName)
	{
		super(name, designation);
		this.groupName = groupName;
	}
	public void dancing()
	{
		System.out.println("Dancing ...");
	}
}
