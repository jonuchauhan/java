

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car("Ford","Fiesta",2022 );
		
		System.out.println(car1.getmake());
		System.out.println(car1.getmodel());
		System.out.println(car1.getyear());
		
		car1.setmodel("Focus");
		System.out.println(car1.getmodel());
		

	}

}

