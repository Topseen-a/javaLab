package lambdasAndStreams.function;

import java.util.function.BinaryOperator;

public class BinaryOperatorImpl {

    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (school, name) -> school + "\n" + name;

        System.out.println(binaryOperator.apply("Hello", "World"));
    }
}
