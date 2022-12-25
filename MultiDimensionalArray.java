public class MultiDimensionalArray {

    public static void main(String[] args) {

        String names[][] = {
                { "james", "harri", "hemant" },
                { "nitin", "carry", "jasmine" },
                { "persi", "messi", "ronny" },

        };

        for (int i = 0; i < names.length; i++) {

            for (int j = 0; j < names[i].length; j++) {

                System.out.println(names[i][j]);
            }

            System.out.println("-------");

        }

    }

}
