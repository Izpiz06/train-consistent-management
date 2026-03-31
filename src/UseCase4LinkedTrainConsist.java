import java.util.LinkedList;

/**
 * ============================================================
 * MAIN CLASS - UseCase4LinkedTrainConsist
 * ============================================================
 *
 * Use Case 4: Maintain Ordered Train Consist using LinkedList
 *
 * Description:
 * Demonstrates ordered insertion, deletion, and manipulation
 * of bogies using LinkedList.
 *
 * @version 4.0
 */
public class UseCase4LinkedTrainConsist {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2 (index-based)
        trainConsist.add(2, "Pantry");

        System.out.println("\nAfter adding Pantry at position 2:");
        System.out.println(trainConsist);

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(trainConsist);
    }
}