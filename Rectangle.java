package inheritance1;

import java.awt.dnd.DropTargetListener;

public class Rectangle {
	private double length;
	private double width;
	public Rectangle()
	{
		length = 0;
		width = 0;
	}
	public Rectangle(double length, double width)
	{
		setDimensions(length, width);
	}
	public void setDimensions(double length, double width)
	{
		if(length>=0)
			this.length = length;
		else
			this.length = 0;
		
		if(width>=0)
			this.width = width;
		else
			this.width = 0;
	}
	public double getWidth()
	{
		return width;
	}
	public double getLength()
	{
		return length;
	}
	public double area()
	{
		return getLength() * getWidth();
	}
	public double perimeter()
	{
		return 2 * (length + width);
	}
	public void printDetails()
	{
		System.out.println("Length = " + length + "\nWidth = " + width);
	}
}
