package lecture2;

public class Person {
	// Attribute (Variables, Properties)
	private String name;
	private String designation;
	
	//Constructors
	public Person()
	{
		this.name = "Ali";
	}
	
	public Person(String name)
	{
		this.name = name;
	}
	
	public Person(String name, String designation)
	{
		this.name = name;
		this.designation = designation;
	}
	
	
	// Methods (function, behaviors)
	public void walk()
	{
		System.out.println("Walking ...");
	}
	public void eat()
	{
		System.out.println("Eating ...");
	}
	public void lern()
	{
		System.out.println("Learning ...");
	}
	
	public String getName() {
		
		return name;
	}
	public  void  setName(String name) 
	{
		this.name = name;
	}
	
	public void displayDetails()
	{
		System.out.println("Name: " + name + "\nDesignation: " + designation);
	}
}
