package lambdasAndStreams.stream;

import java.util.Arrays;
import java.util.List;

public class MapToDouble {

    public static void main(String[] args) {
        //map() -> Stream
        //mapToInt() -> IntStream
        //mapToLong() -> LongStream
        //mapToDouble() -> DoubleStream
        //mapToObj -> Stream transformed from other types of streams

        List<String> list = Arrays.asList("A", "B", "10", "C", "33", "29", "D", "1", "E", "F", "G", "H");
        System.out.println(list.stream()
                .mapToDouble((x) -> x.length())
                .sum());
    }
}
