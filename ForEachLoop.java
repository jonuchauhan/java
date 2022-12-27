import java.util.*;

public class ForEachLoop {
    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "rahul";
        names[1] = "karan";
        names[2] = "varun";

        for (String i : names) {

            System.out.println(i);
        }

        ArrayList<ArrayList<String>> animals = new ArrayList<>();

        ArrayList<String> names_1 = new ArrayList<String>();
        names_1.add("dog");
        names_1.add("cat");
        ArrayList<String> names_2 = new ArrayList<String>();
        names_2.add("rabbit");
        names_2.add("cow");

        animals.add(names_2);
        animals.add(names_1);

        animals.forEach((n) -> System.out.println(n));

    }
}
