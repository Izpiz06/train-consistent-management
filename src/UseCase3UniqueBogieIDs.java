import java.util.HashSet;
import java.util.Set;

/**
 * ============================================================
 * MAIN CLASS - UseCase3UniqueBogieIDs
 * ============================================================
 *
 * Use Case 3: Track Unique Bogie IDs using HashSet
 *
 * Description:
 * Ensures that duplicate bogie IDs are not added to the train.
 *
 * @version 3.0
 */
public class UseCase3UniqueBogieIDs {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create a HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIds);
    }
}