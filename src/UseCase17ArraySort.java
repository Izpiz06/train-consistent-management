import java.util.Arrays;

/**
 * ============================================================
 * MAIN CLASS - UseCase17ArraySort
 * ============================================================
 *
 * Use Case 17: Sort Bogie Names using Arrays.sort()
 *
 * @version 17.0
 */
public class UseCase17ArraySort {

    /**
     * Method to sort bogie names
     */
    public static String[] sortBogies(String[] bogies) {
        Arrays.sort(bogies);
        return bogies;
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(bogies));

        sortBogies(bogies);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogies));
    }
}