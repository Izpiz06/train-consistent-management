import java.util.HashMap;
import java.util.Map;

/**
 * ============================================================
 * MAIN CLASS - UseCase6BogieCapacityMap
 * ============================================================
 *
 * Use Case 6: Map Bogie to Capacity using HashMap
 *
 * Description:
 * Associates each bogie with its seating/load capacity.
 *
 * @version 6.0
 */
public class UseCase6BogieCapacityMap {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Insert bogie capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 40);

        // Display mapping
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }
    }
}