package lambdasAndStreams.function;

import java.util.function.BiPredicate;

public class BiPredicateImpl {

    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (text, length) -> text.length() > length;
        System.out.println(biPredicate.test("Hello World", 10));
    }
}
