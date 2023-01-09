import java.util.ArrayList;

public class shoppingCart {
	private ArrayList<Item> cart = new ArrayList();
	private double totalPrice;
	public ArrayList<Item> getCarts() {
		return cart;
	}
	public void setCarts(ArrayList<Item> cart) {
		this.cart = cart;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	void addToCart(Item item) {
		cart.add(item);
	}
	public double calculateTotalPrice() {
		for (Item item: cart) {
			this.totalPrice += item.getPrice() * item.getQuantity();
		}
		return this.totalPrice;
	}
	public void printDetails() {
		System.out.println("Welcome ...");
		System.out.println("Your Shopping Cart Items...");
		for (Item item: cart) {
			System.out.println("Item "+item.getId());
			item.printDetails();
		}
	}

}
