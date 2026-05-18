package lambdasAndStreams.function;

@FunctionalInterface
public interface Vehicle {

//    Only one abstract method
    double accelerate(double speed);

//    Other methods
    static double decelerate(double speed) {
        return 0;
    }
}
