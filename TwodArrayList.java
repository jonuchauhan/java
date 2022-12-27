import java.util.*;

public class TwodArrayList {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> class_monitors = new ArrayList<>();

        ArrayList<String> class_9 = new ArrayList<String>();
        class_9.add("Rohan");
        class_9.add("Mohan");

        ArrayList<String> class_10 = new ArrayList<String>();
        class_10.add("varun");
        class_10.add("karan");

        ArrayList<String> class_11 = new ArrayList<String>();
        class_11.add("jasmine");
        class_11.add("malvika");

        class_monitors.add(class_9);
        class_monitors.add(class_10);
        class_monitors.add(class_11);

        for (int i = 0; i < class_monitors.size(); i++) {

            System.out.println(class_monitors.get(i));

            for (int j = 0; j < class_monitors.get(i).size(); j++) {

                System.out.println(class_monitors.get(i).get(j));
            }

        }

    }

}
