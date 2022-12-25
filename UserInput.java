import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter yor name");
        String name = scan.nextLine();
        System.out.println("Your name is :-" + name);
        System.out.println("Enter Your Age");
        int Age = scan.nextInt();
        System.out.println("Your Age is :-" + Age);
        scan.nextLine();
        System.out.println("what is your profession:-");
        String prof = scan.nextLine();
        System.out.println("Your Profession is :-" + prof);

    }

}
