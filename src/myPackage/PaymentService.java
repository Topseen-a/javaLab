package myPackage;

import java.util.HashSet;
import java.util.Set;

public class PaymentService {

    private Set<String> processedKey = new HashSet<String>();

    public void sendMoney(String idempotencyKey, String user, double amount) {
        if (processedKey.contains(idempotencyKey)) {
            System.out.println("Duplicate transaction ignored");
            return;
        }
        processedKey.add(idempotencyKey);
        System.out.println("Transferred N" + amount + " to " + user);
    }

    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        String key = "abc123";
        service.sendMoney(key, "Topseen", 5000);
        service.sendMoney(key, "Topseen", 5000);
        service.sendMoney(key, "Topseen", 5000);
    }
}
