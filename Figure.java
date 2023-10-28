public class Figure {
    int weight;

    public static void paintingFigure(int weight) {
        paintingFrame(weight);
        System.out.println();

        paintingCenter(weight);

        paintingFrame(weight);
    }

    private static void paintingFrame(int weight) {
        for (int i = 0; i < weight - 1; i++) {
            if (i == 0) {
                System.out.print(" ");
            } else {
                System.out.print("-");
            }
        }
    }

    private static void paintingCenter(int weight) {
        // EM - Exclamation Marks
        int currentEM = 1;
        int countEM = 0;

        // До середины (от 1-го !)
        while (countEM < weight - 2 - currentEM) {
            System.out.print("|");

            printSpacesBefore(countEM);

            for (int i = 0; i < currentEM; i++) {
                System.out.print("!");
            }

            countEM += currentEM++;

            printSpacesAfter(weight, countEM);

            System.out.println("|");
        }

        // Середина
        System.out.print("|");

        printSpacesBefore(countEM);

        for (int i = 0; i < weight - 2 - countEM; i++) {
            System.out.print("!");
        }

        System.out.println("|");

        // До конца (до 1-го !)
        while (countEM > 0) {
            countEM -= --currentEM;
            System.out.print("|");

            printSpacesBefore(countEM);

            for (int i = 0; i < currentEM; i++) {
                System.out.print("!");
            }

            printSpacesAfter(weight, countEM + currentEM);

            System.out.println("|");
        }
    }

    private static void printSpacesBefore (int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    private static void printSpacesAfter (int weight, int count) {
        for (int i = 0; i < weight - 2 - count; i++) {
            System.out.print(" ");
        }
    }
}

