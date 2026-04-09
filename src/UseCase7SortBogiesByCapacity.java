import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * ============================================================
 * CLASS - Bogie
 * ============================================================
 *
 * Represents a passenger bogie with name and capacity.
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
        return name + " (" + capacity + " seats)";
    }
}

/**
 * ============================================================
 * MAIN CLASS - UseCase7SortBogiesByCapacity
 * ============================================================
 *
 * Use Case 7: Sort Bogies by Capacity using Comparator
 *
 * @version 7.0
 */
public class UseCase7SortBogiesByCapacity {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        // Display before sorting
        System.out.println("\nBefore Sorting:");
        System.out.println(bogies);

        // Sort using Comparator (ascending by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display after sorting
        System.out.println("\nAfter Sorting by Capacity:");
        System.out.println(bogies);
    }
}