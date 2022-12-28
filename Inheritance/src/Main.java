
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car(4);
		Bycycle bycycle1 = new Bycycle();
		
		car1.start();// start is a method of vehicle class which is inherited by cars
		bycycle1.stop();
		
		System.out.println(car1.doors);
		System.out.println(car1.speed);
		System.out.println(bycycle1.pedal);
		System.out.println(bycycle1.speed);

	}

}
