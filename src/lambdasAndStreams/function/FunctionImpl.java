package lambdasAndStreams.function;

import java.util.function.Function;

public class FunctionImpl {

    public static void main(String[] args) {
        Function<String, Integer> function = (text) -> text.length();
        System.out.println(function.apply("Hello World"));
    }
}
