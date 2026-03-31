import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ============================================================
 * MAIN CLASS - UseCase5LinkedHashSetFormation
 * ============================================================
 *
 * Use Case 5: Preserve Insertion Order of Bogies
 *
 * Description:
 * Uses LinkedHashSet to maintain order + uniqueness
 * of train bogies.
 *
 * @version 5.0
 */
public class UseCase5LinkedHashSetFormation {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Add duplicate intentionally
        trainFormation.add("Sleeper"); // ignored

        // Display final formation
        System.out.println("\nTrain Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);
    }
}