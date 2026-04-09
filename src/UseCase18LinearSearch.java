/**
 * ============================================================
 * MAIN CLASS - UseCase18LinearSearch
 * ============================================================
 *
 * Use Case 18: Linear Search for Bogie ID
 *
 * @version 18.0
 */
public class UseCase18LinearSearch {

    /**
     * Linear search method
     */
    public static boolean searchBogie(String[] bogies, String key) {

        for (String bogie : bogies) {

            if (bogie.equals(key)) {
                return true; // found → early exit
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        String searchKey = "BG309";

        System.out.println("\nSearching for: " + searchKey);

        boolean found = searchBogie(bogies, searchKey);

        if (found) {
            System.out.println("Bogie FOUND");
        } else {
            System.out.println("Bogie NOT FOUND");
        }
    }
}