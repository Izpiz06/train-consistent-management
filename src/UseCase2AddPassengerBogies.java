import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * MAIN CLASS - UseCase2AddPassengerBogies
 * ============================================================
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * Demonstrates dynamic operations on train consist using ArrayList.
 *
 * @version 2.0
 */
public class UseCase2AddPassengerBogies {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create passenger bogie list
        List<String> passengerBogies = new ArrayList<>();

        // ADD bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after insertion
        System.out.println("\nAfter adding bogies:");
        System.out.println(passengerBogies);

        // REMOVE a bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing 'AC Chair':");
        System.out.println(passengerBogies);

        // CHECK existence
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nDoes 'Sleeper' exist? " + exists);

        // Final state
        System.out.println("\nFinal Train Consist:");
        System.out.println(passengerBogies);
    }
}