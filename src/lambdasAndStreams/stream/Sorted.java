package lambdasAndStreams.stream;

import java.util.Arrays;
import java.util.List;

public class Sorted {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(100, 20, 3, 4, -10, 55, 6, 17, 8, 9, -10);
        numbers.stream() //[100, 20, 3, 4, -10, 55, 6, 17, 8, 9, -10]
                .sorted() //[-10, -10, 3, 4, 6, 8, 9, 17, 20, 55, 100]
                .forEach((number) -> {
                    number = number * number;
                    System.out.println(number);
                }); //[100, 100, 9, 16, 36, 64, 81, 289, 400, 3025, 10000]
    }
}
