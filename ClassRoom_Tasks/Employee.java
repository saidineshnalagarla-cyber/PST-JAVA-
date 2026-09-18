import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> marks =
            Arrays.asList(45, 78, 32, 90, 65, 88, 40, 95);

        List<Integer> updated = marks.stream()
            .filter(m -> m >= 60)
            .map(m -> m + 5)
            .sorted(Comparator.reverseOrder())
            .toList();

        System.out.println("Updated marks: " + updated);

        double average = updated.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0);

        System.out.println("Average: " + average);
    }
}
