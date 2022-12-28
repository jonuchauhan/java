import java.util.ArrayList;

public class Array_List {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("harry");
        names.add("robert");
        names.add("carlos");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

    }
}