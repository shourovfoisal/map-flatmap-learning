import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // List Example

        List<String> list1 = List.of("A", "B");
        List<String> list2 = List.of("C", "D", "E");
        List<String> list3 = List.of("F");

        System.out.println(
            Stream.of(list1, list2, list3).flatMap(List::stream).collect(Collectors.toList())
        );
        System.out.println("----------------------");

        // Map Example

        Map<String, List<Integer>> map = new LinkedHashMap<>();

        map.put("one", List.of(1, 2, 3));
        map.put("two", List.of(4, 5, 6));

        System.out.println(
            map.values().stream().flatMap(List::stream).collect(Collectors.toList())
        );
    }
}
