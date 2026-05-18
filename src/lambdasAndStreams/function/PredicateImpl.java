package lambdasAndStreams.function;

import java.util.function.Predicate;

public class PredicateImpl {

    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.length() > 5;
        System.out.println(predicate.test("Hello World"));
    }
}
