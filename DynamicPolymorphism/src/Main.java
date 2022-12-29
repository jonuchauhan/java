import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Animal animal;
		System.out.println("Enter your choice");
		System.out.println("1 For Dog and 2 for Cat");

		int choice = scan.nextInt();

		switch (choice) {
		case 1:
			animal = new Dog();
			animal.speak();
			break;

		case 2:
			animal = new Cat();
			animal.speak();
			break;

		}

		scan.close();

	}

}
