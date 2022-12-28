public class Hero extends Person {
	String power;

	Hero(String name, int age, String power) {
		super(name, age);// this will call the constructor of parent class
		this.power = power;

	}

}
