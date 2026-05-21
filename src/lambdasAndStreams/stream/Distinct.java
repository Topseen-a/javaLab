package lambdasAndStreams.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Distinct {

    public static void main(String[] args) {
        Integer[] integers = {17, 100, 20, 3, 4, -10, 55, 6, 17, 8, 9, -10};
        List<Integer> numbers = Arrays.asList(integers);
        List<Integer> nums = new ArrayList<>();
        numbers.stream() //[17, 100, 20, 3, 4, -10, 55, 6, 17, 8, 9, -10]
                .distinct() //[-10, 3, 4, 6, 8, 9, 17, 20, 55, 100]
                .sorted(Comparator.reverseOrder()) //[100, 55, 20, 17, 9, 8, 6, 4, 3, -10]
                .forEach((number) -> {
                    nums.add(number);
                });
        System.out.println(nums);
    }
}