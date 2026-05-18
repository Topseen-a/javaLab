package lambdasAndStreams.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerImpl {

    public static void main(String[] args) {
        Consumer<String> consumer = (text) -> {
            System.out.println(text);
        };
//        consumer.accept("Hello");

        List<String> words = Arrays.asList("Hello", "World", "Nigeria", "USA");
        words.forEach(consumer);
    }
}
