
public class Main {

	public static void main(String[] args) {
		Car car1 = new Car();
		Boat boat1 = new Boat();
		Bycycle bycycle1 = new Bycycle();

		Vehicle[] vehicles = { car1, boat1, bycycle1 };

		for (Vehicle x : vehicles) {
			x.go();
		}

	}

}
