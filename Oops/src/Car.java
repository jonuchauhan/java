
public class Car {

	String make="Ford";
	String model="Fiest";
	int year =2021;
	String color="Blue";
	double price=30000.00;
	
	
	void drive() {
		System.out.println("You are accessing drive method");
	}
	
	void price() {
		
		System.out.println("Price of this car is :-  " + this.price);
	}

}
