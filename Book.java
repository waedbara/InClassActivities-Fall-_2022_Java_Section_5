package lecture2;

public class Book {
	//Attributes
	private int ID;
	private String title;
	private String author;
	private int publishYear;
	private String publisher;
	public static int count = 0;
	
	//Constructors
	public Book()
	{
		count++;
	}
	public Book(int ID, String title, String author, int publishYear, String publisher)
	{
		this.ID = ID;
		this.title = title;
		this.author = author;
		this.publishYear = publishYear;
		this.publisher = publisher;
		count++;
	}
	
	public Book(int ID, String title)
	{
		this.ID = ID;
		this.title = title;
		count++;
	}
	public Book(String author, int publishYear)
	{
		this.author = author;
		this.publishYear = publishYear;
		count++;
	}
	
	// setters and getters
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPublishYear() {
		return publishYear;
	}
	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Book.count = count;
	}
	// required method
	public void printDetails()
	{
		System.out.println("Book title: " + title + "\nBook ID: " + ID + "\nAuthor: " + author + "\nPublisher: " + publisher +"\nPublished Year: " + publishYear);
	}
	
	
}
