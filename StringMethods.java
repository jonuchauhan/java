public class StringMethods {

    public static void main(String[] args) {

        String name = "Hello";

        boolean result = name.isEmpty();
        System.out.println(result);

        System.out.println("Upper case conversion :- " + name.toUpperCase());
        System.out.println("Lower case conversion :- " + name.toLowerCase());
        System.out.println("Length of string:- " + name.length());
        System.out.println("char at specific position in string " + name.charAt(3));
        System.out.println("string comparision  " + name.equals("HELLO"));
        System.out.println("string comparision  " + name.equalsIgnoreCase("HELLO"));
        System.out.println("index of particular character   " + name.indexOf('o'));
        System.out.println("is empty check of string  " + name.isEmpty());

    }

}
