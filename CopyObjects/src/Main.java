
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Ford","Fiesta",2022);
		Car car2 = new Car("Ford","Focus",2021);
		
		System.out.println(car1);//Car@1ee0005
		System.out.println(car2);//Car@6504e3b2
		//car1=car2;//with this both objects share same address 
		System.out.println(car1);//Car@6504e3b2
		System.out.println(car2);//Car@6504e3b2
		car2.copy(car1);
		System.out.println(car1);//Car@6504e3b2
		System.out.println(car2);//Car@6504e3b2
		System.out.println(car1.getMake());
		System.out.println(car2.getMake());
		
		

	}

}
