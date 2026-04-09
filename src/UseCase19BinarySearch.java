import java.util.Arrays;

/**
 * ============================================================
 * MAIN CLASS - UseCase19BinarySearch
 * ============================================================
 *
 * Use Case 19: Binary Search for Bogie ID
 *
 * @version 19.0
 */
public class UseCase19BinarySearch {

    /**
     * Binary Search Method
     */
    public static boolean binarySearch(String[] bogies, String key) {

        // Ensure sorted input
        Arrays.sort(bogies);

        int low = 0;
        int high = bogies.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = bogies[mid].compareTo(key);

            if (cmp == 0) {
                return true; // found
            } else if (cmp < 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String[] bogies = {"BG309","BG101","BG550","BG205","BG412"};

        String searchKey = "BG205";

        System.out.println("\nSearching for: " + searchKey);

        boolean found = binarySearch(bogies, searchKey);

        if (found) {
            System.out.println("Bogie FOUND");
        } else {
            System.out.println("Bogie NOT FOUND");
        }
    }
}