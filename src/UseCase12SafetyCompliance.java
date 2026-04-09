import java.util.*;
import java.util.stream.*;

/**
 * Goods Bogie class
 */
class GoodsBogie {
    String type;   // Cylindrical / Rectangular
    String cargo;  // Petroleum / Coal

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}

/**
 * UC12: Safety Compliance Check
 */
public class UseCase12SafetyCompliance {

    public static void main(String[] args) {

        System.out.println("=== Train Safety Compliance Check ===");

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // 🔥 Safety Rule
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum"));

        System.out.println("Is Train Safe? " + isSafe);
    }
}