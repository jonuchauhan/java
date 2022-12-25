import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name :");

        String name = scan.nextLine();

        while (name.isEmpty()) {
            System.out.println("Enter your name :");
            name = scan.nextLine();

        }

        System.out.println("Hello " + name);

    }
}
