package lambdasAndStreams.function;

import java.util.concurrent.TimeUnit;

public class Car {

    public static void main(String[] args) {

        Vehicle car = (double distance) -> accelerateFor(distance);

        double acceleration = car.accelerate(9);
        System.out.println("Acceleration: " + acceleration + " m/s^2");
    }

    private static double accelerateFor(double distance) {
        try {
            int delay = 5;
            System.out.println("accelerating...");
            TimeUnit.SECONDS.sleep(delay);
            return distance / delay;
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
