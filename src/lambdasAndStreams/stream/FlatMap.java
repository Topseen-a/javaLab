package lambdasAndStreams.stream;

import java.util.Arrays;
import java.util.List;

public class FlatMap {

    public static void main(String[] args) {
        //flatMap() -> Stream
        //flatMapToInt() -> IntStream
        //flatMapToLong() -> LongStream
        //flatMapToDouble() -> DoubleStream

        List<String> list = Arrays.asList("QWERTY", "ASDFG", "ZXCVB", "HELLO");
        long num = list.stream() //["QWERTY", "ASDFG", "ZXCVB", "HELLO"]
                    .flatMap((x) -> x.chars().boxed())
                //[[Q, W, E, R, T, Y], [A, S, D, F, G], [Z, X, C, V, B], [H, E, L, L, O] ->
                //['Q', 'W', 'E', 'R', 'T', 'Y', 'A', 'S', 'D', 'F', 'G', 'Z', 'X', 'C', 'V', 'B', 'H', 'E', 'L', 'L', 'O']]
                    .count();
        System.out.println(num);
    }
}
