package lambdasAndStreams.function;

import java.util.function.UnaryOperator;

public class UnaryOperatorImpl {

    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = (text) -> text.toUpperCase();
        System.out.println(unaryOperator.apply("Hello World"));
    }
}
