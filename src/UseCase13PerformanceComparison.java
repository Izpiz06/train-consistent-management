import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class UseCase13PerformanceComparison {

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        // Large dataset
        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Sleeper", i % 100));
        }

        // 🔵 LOOP
        long start1 = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long end1 = System.nanoTime();

        // 🟢 STREAM
        long start2 = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long end2 = System.nanoTime();

        System.out.println("Loop Time: " + (end1 - start1));
        System.out.println("Stream Time: " + (end2 - start2));
        System.out.println("Results equal size: " + (loopResult.size() == streamResult.size()));
    }
}