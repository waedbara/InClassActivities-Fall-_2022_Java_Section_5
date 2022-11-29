package lecture2;

public class CarDemo {

	public static void main(String[] args) {
		Car obj1 = new Car(); // creates one object
		Car car1 = new Car(); // creates the second object
		car1.color = "Green";
		car1.year = 1999;
		car1.model = "BMW";
		car1.start();
		car1.beep();
		car1.stop();
		System.out.println("Car1 color is " + car1.color);
		System.out.println("Car1 Model is " + car1.model);
		System.out.println("Car1 Year is " + car1.year);
		obj1.color = "Black";
		obj1.year = 2022;
		obj1.model = "Fiat";
		System.out.println("obj1 color is " + obj1.color);
		System.out.println("obj1 Model is " + obj1.model);
		System.out.println("obj1 Year is " + obj1.year);
		obj1.start();
		obj1.beep();
		obj1.stop();
		System.out.println(obj1.getYear());
	}

}
