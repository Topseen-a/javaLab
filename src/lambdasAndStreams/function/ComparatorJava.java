package lambdasAndStreams.function;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorJava {

    public static void main(String[] args) {
        Comparator<BigDecimal> comparator =
                (BigDecimal x, BigDecimal y) -> {
                    if (x.doubleValue() == y.doubleValue()) {
                        return 0;
                    } else if (x.doubleValue() > y.doubleValue()) {
                        return -1;
                    } else {
                        return 1;
                    }
                };

        int result =  comparator.compare(BigDecimal.valueOf(3000),
                BigDecimal.valueOf(5000));

        Set<BigDecimal> allOurMoney = new TreeSet<>(comparator);
        allOurMoney.add(BigDecimal.valueOf(30000));
        allOurMoney.add(BigDecimal.valueOf(5000));
        allOurMoney.add(BigDecimal.valueOf(1000));

        System.out.println(allOurMoney);
    }
}
