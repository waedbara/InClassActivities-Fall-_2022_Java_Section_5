
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electronic item1 = new Electronic("Dell XPS 15 Laptop",1899,1,"12ᵗʰ Gen Intel® Core™ i7-1260P",16);
		Furniture item2 = new Furniture("Laptop Table",30,1,"Wood","Classic");
		shoppingCart cart1 = new shoppingCart();
		cart1.addToCart(item1);
		cart1.addToCart(item2);
		cart1.printDetails();
		System.out.println("Total Price = "+ cart1.calculateTotalPrice());
	}

}
