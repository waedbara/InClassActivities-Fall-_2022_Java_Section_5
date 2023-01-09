
public class Item {
	private int Id;
	private static int items_count;
	private String name;
	private double price;
	private int quantity;
	public Item(String name, double price,int quantity) {
		this.Id = items_count + 1;
		setName(name);
		setPrice(price);
		setQuantity(quantity);
		items_count++;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getId() {
		return Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void printDetails() {
		System.out.println("Name = "+name+ "\nPrice = "+price+ "\nQuantity = "+quantity);
		
	}
	
}
