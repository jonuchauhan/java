import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your age");
		int age = scan.nextInt();

		try {
			checkage(age);
		} catch (Exception e) {
			System.out.println(e);
		}

		scan.close();

	}

	static void checkage(int age) throws AgeException {
		if (age < 18) {
			throw new AgeException("Your age is less than 18 yrs");
		} else {
			System.out.println("you are entitled for registration");

		}
	}
}
