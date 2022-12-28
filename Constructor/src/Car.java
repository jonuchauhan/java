
public class Car {
	
	String make;
	String model;
	int year;
	double price;
	
	Car(String make, String model,int year,double price){
		this.make=make;
		this.model=model;
		this.year=year;
		this.price=price;
	}
		void drive(){
			
			System.out.println("You are driving :- " + this.make);
			
		}
		
	  void price() {
		  
		  System.out.println("Price of the car is "+ this.price);
	  }	
		
	}
	


