package lambdasAndStreams.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamCreator {

    public static void main(String[] args) {
        Set<String> words = Set.of(
                "ONE",
                "TWO",
                "THREE",
                "FOUR"
        );

        List<String> list = words
                .stream()
                .toList();

        System.out.println(list);

        Stream.of(10, 20, 30, 40, 50)
                .takeWhile((number) -> number < 50)
                .forEach(System.out::println);
    }
}
