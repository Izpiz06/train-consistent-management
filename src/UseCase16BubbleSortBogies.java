import java.util.*;

/**
 * ============================================================
 * CLASS - Bogie
 * ============================================================
 */
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

/**
 * ============================================================
 * MAIN CLASS - UseCase16BubbleSortBogies
 * ============================================================
 *
 * Use Case 16: Sort Passenger Bogies using Bubble Sort
 *
 * @version 16.0
 */
public class UseCase16BubbleSortBogies {

    // 🔥 Bubble Sort (ascending by capacity)
    public static void bubbleSort(List<Bogie> bogies) {

        int n = bogies.size();

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (bogies.get(j).capacity > bogies.get(j + 1).capacity) {

                    // swap
                    Bogie temp = bogies.get(j);
                    bogies.set(j, bogies.get(j + 1));
                    bogies.set(j + 1, temp);

                    swapped = true;
                }
            }

            // optimization
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Second Sitting", 90));

        System.out.println("\nBefore Sorting:");
        System.out.println(bogies);

        // Apply Bubble Sort
        bubbleSort(bogies);

        System.out.println("\nAfter Bubble Sort (Ascending Capacity):");
        System.out.println(bogies);
    }
}