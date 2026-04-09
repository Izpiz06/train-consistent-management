/**
 * ============================================================
 * MAIN CLASS - UseCase20SafeSearch
 * ============================================================
 *
 * Use Case 20: Safe Search with Exception Handling
 *
 * @version 20.0
 */
public class UseCase20SafeSearch {

    /**
     * Safe search with validation
     */
    public static boolean searchBogie(String[] bogies, String key) {

        // 🔥 FAIL-FAST VALIDATION
        if (bogies == null || bogies.length == 0) {
            throw new IllegalStateException("No bogies available for search.");
        }

        // Linear search (reuse UC18 logic)
        for (String bogie : bogies) {
            if (bogie.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String[] bogies = {"BG101","BG205","BG309"};

        String searchKey = "BG205";

        try {
            boolean found = searchBogie(bogies, searchKey);

            if (found) {
                System.out.println("Bogie FOUND");
            } else {
                System.out.println("Bogie NOT FOUND");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}