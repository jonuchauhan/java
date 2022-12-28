
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Fiesta");
		Car car2 = new Car("mustang");
		Car car3 = new Car("kiga");

		Car[] ford = { car1, car2, car3 };

		System.out.println(ford[0].name);
		System.out.println(ford[1].name);
		System.out.println(ford[2].name);

	}

}
