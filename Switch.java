import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter any number between 1-7");
        int x = scan.nextInt();

        switch (x) {

            case 1:
                System.out.println("Day is Monday");
                break;
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
            case 7:
                System.out.println("Day is Sunday");
                break;
            default:
                System.out.println("Not a valid number");
                break;

        }

    }

}
