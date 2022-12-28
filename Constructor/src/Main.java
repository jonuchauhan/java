
public class Main {

	public static void main(String[] args) {
		Car car1= new Car("Ford","Fiesta",2021,200000);
		Car car2 =new Car("Toyota","Yaris",2021,300000);
		
		car1.drive();
		car2.drive();
		
		car1.price();
		car2.price();
	}
}
