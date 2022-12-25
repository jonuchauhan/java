
public class Array {

    public static void main(String[] args) {

        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {

            names[i] = Integer.toString(i);

        }

        for (int j = 0; j < names.length; j++) {

            System.out.println("value of names at index " + j + " is " + names[j]);
        }
    }

}
