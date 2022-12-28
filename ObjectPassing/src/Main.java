
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("fiesta");
		Car car2 = new Car("yaris");
		Garage garage = new Garage();
		garage.park(car1);
		garage.park(car2);

	}

}
