import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scan.nextInt();

        if (x == 0) {
            System.out.println("Number value is zero");

        }

        else if (x > 0 & x < 101) {

            System.out.println("Number is Between 1 and 100");

        }

        else {
            System.out.println("Number is greater than 100");
            

        }

    }
}