package lecture2;

public class BookDemo {

	public static void main(String[] args) {
		System.out.println(Book.count);
		Book book1 = new Book();
		System.out.println(Book.count);
		Book book2 = new Book();
		System.out.println(Book.count);
		Book book3 = new Book(123, "Java Programming", "Ahmad", 2021, "IEEE");
		System.out.println(Book.count);
	}

}
