
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog1 = new Dog();
		Animal animal1 = new Animal();

		dog1.speak();// Overrides parent method
		animal1.speak();// taking method from parent class
	}

}
