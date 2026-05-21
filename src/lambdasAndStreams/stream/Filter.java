package lambdasAndStreams.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {

    public static void main(String[] args) {
        System.out.println(Stream.of(10, 30, 40,35, 33, 77, 10, 41,90)
                .filter((x) -> x > 80)
                .collect(Collectors.toList()));
    }
}