package lambdasAndStreams.function;

import java.util.function.BiFunction;

public class BiFunctionImpl {

    public static void main(String[] args) {
        BiFunction<String, Integer, String> biFunction = (text, length) -> String.valueOf(length) + text;
        System.out.println(biFunction.apply("Hello World", 10));
    }
}
