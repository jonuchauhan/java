public class SwapVariables {

    public static void main(String[] args) {

        String x = "hello";
        String y = "world";
        System.out.println("value of x is :- " + x);
        System.out.println("value of y is :-  " + y);
        String z = "";
        z = x;
        x = y;
        y = z;
        System.out.println("Values after swap");
        System.out.println("value of x is :- " + x);
        System.out.println("value of y is :-  " + y);

    }
}