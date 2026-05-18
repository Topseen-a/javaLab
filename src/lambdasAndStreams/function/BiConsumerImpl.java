package lambdasAndStreams.function;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerImpl {

    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (text, length) -> {
            System.out.println(text + " " + length);
        };

        Map<String, Integer> map = new HashMap<>();
        map.put("ONE", 3);
        map.put("TWO", 3);
        map.put("THREE", 3);

        map.forEach(biConsumer);
    }
}
