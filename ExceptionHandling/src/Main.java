import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");

		try {
			int x = scan.nextInt();
			System.out.println("Enter Second number");
			int y = scan.nextInt();

			double z = x / y;
			System.out.println("result of divison is " + z);
			scan.close();
		} 
		catch (ArithmeticException e)
		{
			System.out.println("zero cannot be given" + e);
		}
		catch (InputMismatchException e)
		{
			System.out.println("Please give int values only" + e);
		}
        catch (Exception e) 
		{
			System.out.println("Some other errors" + e);
		}

	}

}
