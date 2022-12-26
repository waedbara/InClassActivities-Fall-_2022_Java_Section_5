package lecture2;

public class Programmer extends Person{
	private String companyName;
	public Programmer()
	{
		super();
		companyName = "ABC";
	}
	
	public Programmer(String name, String designation, String companyName)
	{
		super(name, designation);
		this.companyName = companyName;
	}
	
	public Programmer(String name, String companyName)
	{
		super(name);
		this.companyName = companyName;
	}
	
	public void coding()
	{
		System.out.println("Coding ....");
	}
	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}
	
	public String getCompanyName()
	{
		return companyName;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Company Name: " + companyName);
	}
}
