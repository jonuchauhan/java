public class OverLoadedMethods {

    public static void main(String[] args) {

        System.out.println(addition(1, 2));
        System.out.println(addition(1, 2, 3));
        System.out.println(addition(1, 2, 3, 4));

    }

    static int addition(int a, int b) {
        System.out.println("first overloaded method");
        return a + b;
    }

    static int addition(int a, int b, int c) {
        System.out.println("Second overloaded method");
        return a + b + c;
    }

    static int addition(int a, int b, int c, int d) {
        System.out.println("Third overloaded method");
        return a + b + c + d;
    }

}