package inheritance1;

public class Box extends Rectangle{
	private double height;
	public Box()
	{
		super();
		height = 0;
	}
	public Box(double length, double width, double height)
	{
		setDimensions(length, width, height);
	}
	public void setDimensions(double length, double width, double height) // overloading
	{
		setDimensions(length, width);
		if(height >= 0)
			this.height = height;
		else
			height = 0;
	}
	
	public double getHeight()
	{
		return height;
	}
	public double area() //override
	{
		return 2 * (getLength()*getWidth() + getLength()*getHeight() + getWidth()*getHeight());
	}
	
	public double volume()
	{
		return super.area() * getHeight();
	}
	
	public void printDetails() //override
	{
		super.printDetails();
		System.out.println("Height = " + height);
	}
	
	
	
	
	
	
}
