import java.util.ArrayList;
import java.util.List;
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
        return name + " (" + capacity + " seats)";
    }
}

/**
 * ============================================================
 * MAIN CLASS - UseCase8FilterBogiesStream
 * ============================================================
 *
 * Use Case 8: Filter Passenger Bogies using Streams
 *
 * @version 8.0
 */
public class UseCase8FilterBogiesStream {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogie list (reuse UC7 concept)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("\nOriginal Bogies:");
        System.out.println(bogies);

        // 🔥 Stream Filtering (capacity > 60)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered result
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        System.out.println(filteredBogies);

        // Verify original list unchanged
        System.out.println("\nOriginal List After Filtering (Unchanged):");
        System.out.println(bogies);
    }
}