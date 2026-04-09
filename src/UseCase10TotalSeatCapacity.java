import java.util.*;
import java.util.stream.Collectors;

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
 * MAIN CLASS - UseCase10TotalSeatCapacity
 * ============================================================
 *
 * Use Case 10: Calculate Total Seating Capacity using reduce()
 *
 * @version 10.0
 */
public class UseCase10TotalSeatCapacity {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("\nBogie List:");
        System.out.println(bogies);

        // 🔥 STREAM AGGREGATION
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // Display result
        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        // Verify original list unchanged
        System.out.println("\nOriginal List After Aggregation:");
        System.out.println(bogies);
    }
}