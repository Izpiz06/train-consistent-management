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
 * MAIN CLASS - UseCase9GroupBogies
 * ============================================================
 *
 * Use Case 9: Group Bogies by Type using Streams
 *
 * @version 9.0
 */
public class UseCase9GroupBogies {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 72));      // duplicate type
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("AC Chair", 56));     // duplicate type

        System.out.println("\nOriginal Bogie List:");
        System.out.println(bogies);

        // 🔥 GROUPING BY NAME (TYPE)
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped result
        System.out.println("\nGrouped Bogies by Type:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Verify original list unchanged
        System.out.println("\nOriginal List After Grouping (Unchanged):");
        System.out.println(bogies);
    }
}